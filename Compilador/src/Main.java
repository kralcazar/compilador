import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.*;

import org.apache.commons.io.*;
import gram.*;
import compilador.*;

public class Main {
    private static Writer buffer;
    public static void main(String[] args) throws Exception  {
        if(args.length==0) {
            System.out.println("Argumentos necesarios no encontrados");
            return;
        }
        //String file = System.getProperty("user.dir") + "\\programas\\test.esl";
        //String buildPath = System.getProperty("user.dir") + "\\programas\\test.esl";
        // Nombre del archivo procesado
        String filename = FilenameUtils.getBaseName(args[0]);
        String buildPath = System.getProperty("user.dir") + "\\programas\\" + filename + "\\";
        File buildDir = new File(buildPath);
        if (!buildDir.mkdirs()) {
            FileUtils.cleanDirectory(buildDir);
        }
        System.out.println("Leyendo "+args[0]);
        CharStream stream = CharStreams.fromFileName(System.getProperty("user.dir") + "\\programas\\" + args[0]);

        // Se obtienen los tokens a partir de la gramática
        eGramLexer lexer = new eGramLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        // Análisis del código fuente
        eGramParser parser = new eGramParser(tokens, buildPath);
        try {
            tokens.seek(0);
            parser.program();
            System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT
                    + "Proceso de análisis completado con éxito" + ConsoleColors.RESET);
        } catch (RuntimeException e) {
            System.out.println("Se encontraron errores en el código:");
            System.out.println(ConsoleColors.RED_BOLD + e.getMessage() + ConsoleColors.RESET);
            File erroresFile = new File(buildPath + "errores.txt");
            Writer buffer = new BufferedWriter(new FileWriter(erroresFile));
            if (e != null) {
                buffer.write(e.getMessage());
            }
            buffer.close();
            return;
        }

        //Generación del código intermedio
        eGramC3D parserC3D;
        parserC3D = new eGramC3D(tokens, buildPath, parser.getSymbolTable());
        try {
            tokens.seek(0);
            parserC3D.program();
            System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT
                                + "Proceso de generación de código completado con éxito" + ConsoleColors.RESET);
        } catch (RuntimeException e) {
            System.out.println(
                    ConsoleColors.RED_BOLD + "Error al generar código:" + ConsoleColors.RESET);
            throw e;
        }

        //Ensamblado de código sin optimizar
        Assembler normal = new Assembler(buildPath + filename, parserC3D.getC3D(),
                parserC3D.getTv(), parserC3D.getTp(), parserC3D.getTe());
        normal.assemble();

        // Imprimir ficheros para comprobación
        printFiles(buildPath, tokens, parser, parserC3D);

    }

    private static void printFiles(String folder, CommonTokenStream tokens, eGramParser parser, eGramC3D c3d){
        printTokens(folder, tokens, "tokens");
        printProceduresTable(folder, c3d.getTp(), "ProceduresTable");
        printVariablesTable(folder, c3d.getTv(), "VariablesTable");
        printC3D(folder, c3d, "C3D");
    }

    private static void printTokens(String folder, CommonTokenStream tokens, String name){
        File tokensFile = new File(folder + name + ".txt");
        try {
            buffer = new BufferedWriter(new FileWriter(tokensFile));
            for (Token tok : tokens.getTokens()) {
                buffer.write(tok.getText() + '\n');
            }
            buffer.close();
        } catch(IOException e) {}
    }

    private static void printC3D(String folder, eGramC3D c3d, String name){
        File interFile = new File(folder + name + ".txt");
        try {
            buffer = new BufferedWriter(new FileWriter(interFile));
            for(int i=0;i < c3d.getC3D().size();i++) {
                buffer.write(c3d.getC3D().get(i).toString() + "\n");
            }
            buffer.close();
        } catch(IOException e) {}
    }
    private static void printProceduresTable(String folder, ProceduresTable pt, String name){
        try {
            File tsFile = new File(folder + name + ".html");
            buffer = new BufferedWriter(new FileWriter(tsFile));
            String table = "<!DOCTYPE html><html><head><head><style>table, th, td {  border: 1px solid black;  border-collapse: collapse;}th, td {  padding: 5px;  text-align: center;}</style></head><body><table style=\"width:100%; background-color:#727272; font-family:'Courier New'\"><tr style=\"color:white\"><th>tipo</th><th>nombre</th><th>prof</th><th>inicio</th><th>numParams</th><th>ocupVL</th></tr>";
            Procedure proc;
            String start, numParams;
            for (int i = 0; i < pt.getTP().size(); i++) {
                proc = pt.getTP().get(i);
                table += "<tr style=\"background-color:";
                switch (proc.getType()) {
                    case FUNC:
                        table += "#D1BCFF\">";
                        break;
                    case PROC:
                        table += "#FFD1BC\">";
                        break;
                    default:
                        break;
                }
                if (proc.getStartTag() != 0) {
                    start = String.valueOf(proc.getStartTag());
                } else {
                    start = "-";
                }
                if (proc.getNumParams() != 0) {
                    numParams = String.valueOf(proc.getNumParams());
                } else {
                    numParams = "-";
                }
                table += "<td>" + proc.getType() + "</td><td>" + proc.toString() + "</td><td>"
                        + proc.getProf() + "</td><td>" + start + "</td><td>" + numParams
                        + "</td><td>" + proc.getOcupVL() + "</td></tr>";
            }
            table += "</table></body></html>";
            buffer.write(table);
            buffer.close();
        } catch (

                IOException e) {
            System.out.println("Error escribiendo la tabla de procedimientos: " + e.getMessage());
        }
    }

    private static void printVariablesTable(String folder, VariablesTable vt, String name){
        try {
            File tsFile = new File(folder + name + ".html");
            buffer = new BufferedWriter(new FileWriter(tsFile));
            String table = "<!DOCTYPE html><html><head><head><style>table, th, td {  border: 1px solid\n"
                    + " black;  border-collapse: collapse;}th, td {  padding: 5px;  text-align:\n"
                    + " center;}</style></head><body><table style=\"width:100%; \n"
                    + "background-color:#727272; font-family:'Courier New'\"><tr \n"
                    + "style=\"color:white\"><th>tsub</th><th>nombre</th><th>temporal</th>\n"
                    + " <th>proc</th><th>tipo</th><th>valor</th><th>elementos</th><th>ocup</th>\n"
                    + "<th>desp</th><th>nparam</th></tr>";
            Variable var;
            String valor, proc, nparam, desp, elementos;
            for (int i = 0; i < vt.getTv().size(); i++) {
                var = vt.getTv().get(i);
                table += "<tr style=\"background-color:";
                switch (var.getDataType()) {
                    case STRING:
                        table += "#D1BCFF\">";
                        break;
                    case INT:
                        table += "#FFD1BC\">";
                        break;
                    case BOOLEAN:
                        table += "#BCFFD1\">";
                        break;
                    case NULL:
                        table += "#D6A384\">";
                        break;
                }
                if (var.getValue() != null) {
                    if(var.getDataType()== Symbol.DataTypes.BOOLEAN) {
                        if (var.getValue().equals("-1")) {
                            valor = "true";
                        } else {
                            valor = "false";
                        }
                    } else {
                        valor = var.getValue();
                    }
                } else {
                    valor = "-";
                }
                if (var.proc() != 0) {
                    proc = String.valueOf(var.proc());
                } else {
                    proc = "-";
                }
                if (var.getNparam() != 0) {
                    nparam = String.valueOf(var.getNparam());
                } else {
                    nparam = "-";
                }
                if (var.getDesp() != 0) {
                    desp = String.valueOf(var.getDesp());
                } else {
                    desp = "-";
                }
                if (var.getElements() != 1) {
                    elementos = String.valueOf(var.getElements());
                } else {
                    elementos = "-";
                }
                if (!var.isDeleted())
                    table += "<td>" + var.getDataType() + "</td><td>" + var.toString() + "</td><td>"
                            + var.temporal() + "</td><td>" + proc + "</td><td>" + var.type()
                            + "</td><td>" + valor + "</td><td>" + elementos + "</td><td>"
                            + var.getOcup() + "</td><td>" + desp + "</td><td>" + nparam
                            + "</td></tr>";
            }
            table += "</table></body></html>";
            buffer.write(table);
            buffer.close();
        } catch (IOException e) {
            System.out.println("Error escribiendo la tabla de variables: " + e.getMessage());
        }

    }
}