package compilador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import compilador.Instruction.OP;

/**
 *
 *
 * @author Joan Campaner i Crist Alcázar
 */

public class Optimizer {
    private String directory;
    private ArrayList<Instruction> C3D;
    private VariablesTable tv;
    private ProceduresTable tp;
    private TagsTable te;

    public Optimizer(String directory, final ArrayList<Instruction> C3D, VariablesTable tv,
                       ProceduresTable tp, TagsTable te) {
        this.directory = directory;
        this.C3D = C3D;
        this.tv = tv;
        this.tp = tp;
        this.te = te;
    }

    private void C3DQuitInstruction(int position) {
        if (C3D.get(position).isInstFinal()) {
            C3D.get(position - 1).setInstFinal(true);
        }
        C3D.remove(position);
    }

    private void C3DQuitInstruction(Instruction ins) {
        int position = C3D.indexOf(ins);
        if (C3D.get(position).isInstFinal()) {
            C3D.get(position - 1).setInstFinal(true);
        } else {
            C3D.remove(position);
        }
    }

    public void optimize() {
        optimizeAssignBoolean();
        deleteCodeIfInaccessible();
        optimizeIfNegateCond();
        deleteUnnecessaryTags();
        deleteInaccessibleCodeBetweenTags();
        deleteUnnecessaryAssignments();
        deleteInaccessibleCodeBetweenTags();
        reassignTagLine();
        tv.calcDespOcupVL(tp);
        printC3D();
    }

    /**
     * Imprime el código C3D una vez aplicadas las optimizaciones
     */
    private void printC3D() {
        Writer buffer;
        File interFile = new File(directory + "_C3D.txt");
        try {
            buffer = new BufferedWriter(new FileWriter(interFile));
            for (int i = 0; i < C3D.size(); i++) {
                buffer.write(C3D.get(i).toString() + "\n");
            }
            buffer.close();
            System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT
                    + "Proceso de optimización completado con éxito" + ConsoleColors.RESET);
        } catch (IOException e) {
        }
    }

    /**
     * Comprueba y optimiza el código C3D de los IF con valores sabidos en tiempo de
     * compilación
     */
    private void deleteCodeIfInaccessible() {
        for (int i = 0; i < C3D.size(); i++) {
            Instruction ins = C3D.get(i);
            if (isIf(ins)) {
                if (operatingConstants(ins)) {
                    i += executeIf(ins, i);
                }
            }
        }
    }

    /**
     * Detecta y optimiza la assignación de un boolean.
     */

    private void optimizeAssignBoolean() {
        for (int i = 0; i < C3D.size(); i++) {
            Instruction ins = C3D.get(i);
            if (isIf(ins)) {
                Variable operating1 = tv.get(ins.getOperating(1));
                if (operating1.getDataType() == Symbol.DataTypes.BOOLEAN && operating1 != null
                        && C3D.get(i).destination().equals(C3D.get(i + 2).destination())) {
                    ArrayList<Instruction> arrayaux = new ArrayList<Instruction>();
                    arrayaux.add(new Instruction(OP.copy, C3D.get(i).getOperating(1), "",
                            C3D.get(i + 3).destination()));
                    replaceCode(arrayaux, i, i + 7);
                }
            }
        }
    }

    /**
     * Comprueba y elimina todas las etiquetas de salto (skip) las cuales no tengan
     * una instrucción de salto (goto) asignadas
     */
    private void deleteUnnecessaryTags() {
        ArrayList<String> skips = new ArrayList<String>();
        ArrayList<String> gotos = new ArrayList<String>();
        for (int i = 0; i < C3D.size(); i++) {
            Instruction ins = C3D.get(i);
            if (ins.getOpCode() == Instruction.OP.skip && !te.get(ins.destination()).isDeproc()) {
                skips.add(ins.destination());
            } else if (ins.getOpCode() == Instruction.OP.jump || isIf(ins)) {
                gotos.add(ins.destination());
            }
        }
        skips.removeAll(gotos);
        Instruction aux;
        int i = 0;
        boolean deleted;
        while (i < C3D.size()) {
            aux = C3D.get(i);
            deleted = false;
            if (aux.getOpCode() == Instruction.OP.skip) {
                for (int j = 0; j < skips.size(); j++) {
                    if (skips.get(j).equals(aux.destination())) {
                        C3DQuitInstruction(i);
                        j = skips.size();
                        deleted = true;
                    }
                }
            }
            if (!deleted)
                i++;
        }
        i = 0;
        deleted = false;
        while (i < C3D.size() - 1) {
            if (deleted)
                C3DQuitInstruction(i - 1);
            deleted = false;
            if (C3D.get(i).getOpCode() == Instruction.OP.jump) {
                if (C3D.get(i + 1).getOpCode() == Instruction.OP.skip
                        && C3D.get(i).destination().equals(C3D.get(i + 1).destination())) {
                    deleted = true;
                    C3DQuitInstruction(i);
                }
            }
            i++;
        }
    }

    /**
     * Para cada conjunto de instructiones entre un goto y su skip más cercano, si
     * no se detecta un skip de otra etiqueta, elimina el código entre goto y el
     * skip, sin incluir el skip. Después llama a la función
     * "deleteUnnecessaryTags()" para borrar todos los skips que no tengan un
     * gotos asocioados después de aplicar esta optimización
     */
    private void deleteInaccessibleCodeBetweenTags() {
        ArrayList<Instruction> aux = new ArrayList<Instruction>();
        int j;
        for (int i = 0; i < C3D.size(); i++) {
            if (C3D.get(i).getOpCode() == Instruction.OP.jump) {
                aux.add(C3D.get(i));
                j = i;
                while (j < C3D.size()) {
                    if (C3D.get(j).getOpCode() == Instruction.OP.skip) {
                        if (C3D.get(j).destination().equals(aux.get(0).destination()))
                            replaceCode(null, i, i + aux.size() - 1);
                        break;
                    }
                    if (aux.size() > 1)
                        aux.add(C3D.get(j));
                    j++;
                }
                aux.clear();
            }
        }
        deleteUnnecessaryTags();
    }

    /**
     * Reduce el número de variables temporales para las asignaciones, siempre y
     * cuando no sean de tipo String o necesitados para pasar por parámetro para una
     * función.
     */
    private void deleteUnnecessaryAssignments() {
        // Lista de asignaciones de variables temporales
        ArrayList<Instruction> InstrucVars = new ArrayList<Instruction>();
        // Lista de parámetros
        ArrayList<Instruction> InstrucParams = new ArrayList<Instruction>();
        // Lista de operaciones aritméticas
        ArrayList<Instruction> InstrucArit = new ArrayList<Instruction>();
        // Se añade a cada lista lo que le corresponde
        int i = 0;
        while (i < C3D.size()) {
            if (C3D.get(i).destination().charAt(0) == 't' && C3D.get(i).destination().charAt(1) == '$') {
                if ((C3D.get(i).getOpCode() == Instruction.OP.copy)) {
                    if (!contieneVariableDestino(InstrucVars, C3D.get(i).destination())
                            && !(tv.get(C3D.get(i).destination()).getDataType() == Symbol.DataTypes.STRING)) {
                        InstrucVars.add(C3D.get(i));
                    }
                } else if (C3D.get(i).getOpCode() == Instruction.OP.params) {
                    InstrucParams.add(C3D.get(i));
                } else if (isArit(C3D.get(i))) {
                    InstrucArit.add(C3D.get(i));
                }
            }
            i++;
        }
        // Evita que las variables temporales generadas para parámetros sean borradas
        int j = 0;
        for (i = 0; i < InstrucParams.size(); i++) {
            j = 0;
            while (j < InstrucVars.size()) {
                if (InstrucParams.get(i).destination().equals(InstrucVars.get(j).destination())) {
                    InstrucVars.remove(j);
                    break;
                }
                j++;
            }
        }
        // Quita de la lista de variables temporales todas las que tengan más de una asignación,
        // evitando que se borren más tarde
        boolean firstEncounter;
        for (i = 0; i < InstrucVars.size(); i++) {
            firstEncounter = false;
            while (j < C3D.size()) {
                if (C3D.get(j).getOpCode() == Instruction.OP.copy) {
                    if (!firstEncounter) {
                        if (InstrucVars.get(i).equals(C3D.get(j))) {
                            firstEncounter = true;
                        }
                    } else {
                        if (InstrucVars.get(i).equals(C3D.get(j))) {
                            InstrucVars.remove(i);
                            break;
                        }
                    }
                }
                j++;
            }
        }
        // Se borran las variables de la lista de InstrucVars y se asigna directamente su contenido
        i = 0;
        int k;
        while (i < InstrucVars.size()) {
            k = returnUsedVarLine(InstrucVars.get(i).destination());
            if (k > 0) {
                if (C3D.get(k).getOperating(1).equals(InstrucVars.get(i).destination())) {
                    C3D.get(k).setOperating(1, InstrucVars.get(i).getOperating(1));
                }
                if (C3D.get(k).getOperating(2) != null) {
                    if (C3D.get(k).getOperating(2).equals(InstrucVars.get(i).destination())) {
                        C3D.get(k).setOperating(2, InstrucVars.get(i).getOperating(1));
                    }
                }
            }
            tv.quitVar(InstrucVars.get(i).destination());
            C3DQuitInstruction(InstrucVars.get(i));
            i++;
        }
        // Se borran las variables de la lista de InstrucArit y se asigna directamente su contenido
        i = 0;
        while (i < InstrucArit.size()) {
            k = returnUsedVarLine(InstrucArit.get(i).destination());
            if (k > 0) {
                for (int a = 0; a < InstrucVars.size(); a++) {
                    if (InstrucVars.get(a).destination().equals(C3D.get(k).getOperating(1))) {
                        C3D.get(k).setOperating(1, InstrucVars.get(a).getOperating(1));
                        C3D.get(k).setOpCode(InstrucArit.get(i).getOpCode());
                        C3D.get(k).setOperating(0, InstrucArit.get(i).getOperating(0));
                        tv.quitVar(InstrucArit.get(i).destination());
                        C3DQuitInstruction(InstrucArit.get(i));
                        break;
                    } else if (InstrucVars.get(a).destination().equals(C3D.get(k).getOperating(2))) {
                        C3D.get(k).setOperating(2, InstrucVars.get(a).getOperating(1));
                        C3D.get(k).setOpCode(InstrucArit.get(i).getOpCode());
                        C3D.get(k).setOperating(0, InstrucArit.get(i).getOperating(0));
                        tv.quitVar(InstrucArit.get(i).destination());
                        C3DQuitInstruction(InstrucArit.get(i));
                        break;
                    }
                }
                if (C3D.get(k).getOpCode() == OP.copy) {
                    for (int a = 0; a < InstrucArit.size(); a++) {
                        if (C3D.contains(InstrucArit.get(a))) {
                            if (InstrucArit.get(a).destination().equals(C3D.get(k).getOperating(1))) {
                                C3D.get(k - 1).setOperating(3, C3D.get(k).destination());
                                tv.quitVar(C3D.get(k).getOperating(1));
                                C3DQuitInstruction(C3D.get(k));
                            }
                        }
                    }
                }
            }
            i++;
        }
        // Si hay asignaciones repetidas contiguas (por como funciona las optimizaciones), se borra
        // una de ellas
        i = 0;
        while (i < C3D.size() - 1) {
            if (C3D.get(i).equals(C3D.get(i + 1))) {
                C3DQuitInstruction(i + 1);
            } else {
                i++;
            }
        }
    }

    /**
     * Reasigna la linea de cada etiqueta al final de las optimizaciones
     */
    private void reassignTagLine() {
        for (int i = 0; i < C3D.size(); i++) {
            Instruction ins = C3D.get(i);
            if (ins.getOpCode() == OP.skip) {
                te.get(ins.destination()).setLine(i + 1);
            }
        }
    }

    /**
     * Optimiza un IF negando la condición, reduciendo el número de etiquetas necesarias.
     */
    private void optimizeIfNegateCond() {
        for (int i = 0; i < C3D.size(); i++) {
            Instruction ins = C3D.get(i);
            if (isIf(ins)) {
                if (!operatingConstants(ins) && noEsIfSwitch(i)) {
                    switch (ins.getOpCode()) {
                        case ifLT:
                            C3D.get(i).setOpCode(OP.ifGE);
                            break;
                        case ifLE:
                            C3D.get(i).setOpCode(OP.ifGT);
                            break;
                        case ifEQ:
                            C3D.get(i).setOpCode(OP.ifNE);
                            break;
                        case ifNE:
                            C3D.get(i).setOpCode(OP.ifEQ);
                            break;
                        case ifGE:
                            C3D.get(i).setOpCode(OP.ifLT);
                            break;
                        case ifGT:
                            C3D.get(i).setOpCode(OP.ifLE);
                            break;
                        default:
                            break;
                    }
                    C3D.get(i).setOperating(3, C3D.get(i + 1).destination());
                    C3DQuitInstruction(i + 1);
                }
            }
        }
    }

    /*
     *
     *
     *
     *
     * Código para optimizaciones
     *
     *
     *
     *
     */

    /**
     * Comprueba que el IF generado no pertenece al codigo de un SWITCH
     *
     * @param i Línea de la instrucción C3D
     * @return
     */
    private boolean noEsIfSwitch(int i) {
        return C3D.get(i).destination().equals(C3D.get(i + 2).destination());
    }

    private boolean contieneVariableDestino(ArrayList<Instruction> arr, String destino){
        boolean b = false;
        for(int i = 0; i<arr.size();i++){
            if(arr.get(i).destination().equals(destino))
                b = true;
        }
        return b;
    }

    /**
     * Devuelve la línea en la lista C3D donde la variable ha sido usada para una
     * asignación (sin ser esta el destino de la propia asignación)
     *
     * @param var
     *                String que contiene el nombre de la variable
     * @return Línea en la lista C3D
     */
    private int returnUsedVarLine(String var) {
        String[] str = new String[4];
        for (int i = 0; i < C3D.size(); i++) {
            str = C3D.get(i).getInstruction();
            if (str[1] != null) {
                if (str[1].equals(var))
                    return i;
            }
            if (str[2] != null) {
                if (str[2].equals(var))
                    return i;
            }
        }
        return -1;
    }

    /**
     * Devuelve las líneas de código C3D que comprenden desde la posición inicial
     * "pos" hasta la posición final "posEtiqueta"
     *
     * @param pos
     *                        Posición inicial
     * @param posEtiqueta
     *                        Posición final marcado por una etiqueta
     * @return Devuelve el código entre las dos posiciones
     */
    private ArrayList<Instruction> pickCode(int pos, int posEtiqueta) {
        boolean ended = false;
        ArrayList<Instruction> list = new ArrayList<Instruction>();
        Instruction ins = C3D.get(pos);
        // Recoger valor etiqueta
        int nEtiqueta = Tag.get(C3D.get(posEtiqueta).destination());
        list.add(ins);
        while (!ended) {
            pos++;
            ins = C3D.get(pos);
            list.add(ins);
            // Comprobar si se ha encontrado el skip con la etiqueta
            if (ins.getOpCode() == Instruction.OP.skip && nEtiqueta == Tag.get(ins.destination()))
                ended = true;
        }
        return list;
    }

    /**
     * Reemplaza el código de C3D entre la posición incial "starts" y la posición
     * final "ends" por la lista de instructiones de codeR.
     *
     * @param codeR
     *                    Lista de instructiones a sustituir en el código de C3D
     * @param starts
     *                    Posición inicial del C3D
     * @param ends
     *                    Posición final del C3D
     */
    private void replaceCode(ArrayList<Instruction> codeR, int starts, int ends) {
        List<Instruction> sublistCode = this.C3D.subList(starts, ends);
        for (int i = 0; i < sublistCode.size(); i++) {
            if (sublistCode.get(i).isInstFinal()) {
                codeR.get(codeR.size() - 1).setInstFinal(true);
                break;
            }
        }
        sublistCode.clear();
        if (codeR != null)
            this.C3D.addAll(starts, codeR);
    }

    /**
     * Comprueba si la instrucción "ins" es una instrucción de tipo IF
     *
     * @param ins
     *                Instrucción a comprobar
     * @return Valor de la comprobación
     */
    private boolean isIf(Instruction ins) {
        return (ins.getOpCode() == Instruction.OP.ifLT || ins.getOpCode() == Instruction.OP.ifLE
                || ins.getOpCode() == Instruction.OP.ifEQ || ins.getOpCode() == Instruction.OP.ifNE
                || ins.getOpCode() == Instruction.OP.ifGE
                || ins.getOpCode() == Instruction.OP.ifGT);
    }

    /**
     * Comprueba si la instrucción "ins" es una instrucción de tipo aritmético
     *
     * @param ins
     *                Instrucción a comprobar
     * @return Valor de la comprobación
     */
    private boolean isArit(Instruction ins) {
        return (ins.getOpCode() == Instruction.OP.add || ins.getOpCode() == Instruction.OP.sub
                || ins.getOpCode() == Instruction.OP.mult || ins.getOpCode() == Instruction.OP.div
                || ins.getOpCode() == Instruction.OP.mod);
    }

    /**
     * Comprueba si los 2 opereandos de la instrucción "ins" son valores constantes
     *
     * @param ins
     *                Instrucción a comprobar
     * @return Valor de la comprobación
     */
    private Boolean operatingConstants(Instruction ins) {
        boolean isConst1 = false, isConst2 = false;
        Variable operating1 = tv.get(ins.getOperating(1));
        if (operating1 == null || operating1.type() == Symbol.Types.CONST
                || (operating1.isTemporal() && operating1.getValue() != null)) {
            isConst1 = true;
        }

        Variable operating2 = tv.get(ins.getOperating(2));
        if (operating2 == null || operating2.type() == Symbol.Types.CONST
                || (operating2.isTemporal() && operating2.getValue() != null)) {
            isConst2 = true;
        }

        return isConst1 && isConst2;
    }

    /**
     * Para cada caso de IF en relación al operador relacional usado en él,
     * comprueba si es cierto o falso y llama a la función que realizará la
     * optimización del IF
     *
     * @param ins
     *                    Instrucción de tipo IF a comprobar
     * @param starts
     *                    Número de la instrucción en la lista C3D
     * @return Número de líneas reemplazadas por la función de optimización del IF
     */
    private int executeIf(Instruction ins, int starts) {
        int replaceLines = 0;
        int c1, c2;
        Variable v1, v2;
        v1 = tv.get(ins.getOperating(1));
        if (v1 != null) {
            c1 = Integer.parseInt(v1.getValue()); // Constante
        } else {
            c1 = Integer.parseInt(ins.getOperating(1)); // Literal
        }
        v2 = tv.get(ins.getOperating(2));
        if (v2 != null) {
            c2 = Integer.parseInt(v2.getValue()); // Constante
        } else {
            c2 = Integer.parseInt(ins.getOperating(2)); // Literal
        }
        switch (ins.getOpCode()) {
            case ifLT:
                if (c1 < c2) {
                    replaceLines = optimizeIfTrue(starts);
                } else {
                    replaceLines = optimizeIfFalse(starts);
                }
                break;
            case ifLE:
                if (c1 <= c2) {
                    replaceLines = optimizeIfTrue(starts);
                } else {
                    replaceLines = optimizeIfFalse(starts);
                }
                break;
            case ifEQ:
                if (c1 == c2) {
                    replaceLines = optimizeIfTrue(starts);
                } else {
                    replaceLines = optimizeIfFalse(starts);
                }
                break;
            case ifNE:
                if (c1 != c2) {
                    replaceLines = optimizeIfTrue(starts);
                    ;
                } else {
                    replaceLines = optimizeIfFalse(starts);
                }
                break;
            case ifGE:
                if (c1 >= c2) {
                    replaceLines = optimizeIfTrue(starts);
                } else {
                    replaceLines = optimizeIfFalse(starts);
                }
                break;
            case ifGT:
                if (c1 > c2) {
                    replaceLines = optimizeIfTrue(starts);
                } else {
                    replaceLines = optimizeIfFalse(starts);
                }
                break;
            default:
                break;
        }
        return replaceLines;
    }

    /**
     * Optimiza un IF cierto
     *
     * @param starts
     *                    Número de la instrucción en la lista C3D
     * @return Número de líneas reemplazadas por la función
     */
    private int optimizeIfTrue(int starts) {
        int replaceLines = 0;
        ArrayList<Instruction> lista = pickCode(starts, starts + 1);
        // Se cambia la instrucción if (valor) goto e por goto e
        lista.add(0, new Instruction(Instruction.OP.jump, "", "", lista.get(0).destination()));
        // Se borran las dos instructiones que vienen a continuación del goto e
        lista.remove(1);
        lista.remove(1);
        replaceCode(lista, starts, starts + lista.size() + 1);
        replaceLines = lista.size();
        return replaceLines;
    }

    /**
     * Optimiza un IF falso
     *
     * @param starts
     *                    Número de la instrucción en la lista C3D
     * @return Número de líneas reemplazadas por la función
     */
    private int optimizeIfFalse(int starts) {
        int replaceLines = 0;
        ArrayList<Instruction> lista = pickCode(starts, starts + 1);
        ArrayList<Instruction> aux = new ArrayList<Instruction>();
        // Se sustituye todo el código por la segunda y última instruction
        aux.add(lista.get(1));
        aux.add(lista.get(lista.size() - 1));
        replaceCode(aux, starts, starts + lista.size());
        replaceLines = aux.size();
        return replaceLines;
    }

    public VariablesTable getTv() {
        return tv;
    }

    public ProceduresTable getTp() {
        return tp;
    }

    public TagsTable getTe() {
        return te;
    }

    public void setTp(ProceduresTable tp) {
        this.tp = tp;
    }

    public ArrayList<Instruction> getC3D() {
        return C3D;
    }
}
