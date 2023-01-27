package compilador;

import java.util.Arrays;

/**
 * La clase Instruccion representa una insttrucción de código de tres direcciones.
 *
 * @author Joan Campaner i Crist Alcázar
 */
public class Instruction {
    private OP opCode; // El código de la operación
    private String[] instruction = new String[4]; // Los componentes de la instruccion
    private boolean instFinal; // Si es la instrucción final de una subrutina

    public enum OP {
        copy, add, sub, mod, mult, div, neg, and, or, not, skip, ifLT, ifLE, ifEQ, ifNE, ifGE, ifGT,
        jump, pmb, call, ret, st, params, ind_val, ind_ass
    }

    public Instruction(OP opCode, String op1, String op2, String op3) {
        setOpCode(opCode);
        this.instruction[1] = op1;
        this.instruction[2] = op2;
        this.instruction[3] = op3;
    }

    public boolean isInstFinal() {
        return instFinal;
    }

    public void setInstFinal(boolean instFinal) {
        this.instFinal = instFinal;
    }

    @Override
    public String toString() {
        String s = "";
        switch (opCode) {
            case add:
            case sub:
            case mult:
            case div:
            case mod:
            case and:
            case or:
                s = instruction[3] + " = " + instruction[1] + " " + instruction[0] + " "
                        + instruction[2];
                break;
            case copy:
                s = instruction[3] + " " + instruction[0] + " " + instruction[1];
                break;
            case neg:
                s = instruction[3] + " = " + instruction[0] + instruction[1];
                break;
            case not:
                s = instruction[3] + " = " + instruction[0] + " " + instruction[1];
                break;
            case skip:
                s = instruction[3] + ": " + instruction[0];
                break;
            case ifLT:
            case ifLE:
            case ifEQ:
            case ifNE:
            case ifGE:
            case ifGT:
                s = "if " + instruction[1] + " " + instruction[0] + " " + instruction[2] + " goto "
                        + instruction[3];
                break;
            case jump:
            case pmb:
            case call:
            case ret:
                s = instruction[0] + " " + instruction[3];
                if (instruction[1] != null) {
                    s = s + ", " + instruction[1];
                }
                break;
            case params:
                s = instruction[0] + " " + instruction[3];
                break;
            case st:
                s = instruction[0] + " " + instruction[3];
                break;
            case ind_val:
                s = instruction[3] + instruction[0] + instruction[1] + "[" + instruction[2] + "]";
                break;
            case ind_ass:
                s = instruction[3] + "[" + instruction[1] + "]" + instruction[0] + instruction[2];
                break;
            default:
                break;
        }
        return s;
    }

    public String[] getInstruction() {
        return instruction;
    }

    public void setInstruction(String[] instruction) {
        this.instruction = instruction;
    }

    public String getOperating(int n) {
        return instruction[n];
    }

    public void setOperating(int n, String operating) {
        this.instruction[n] = operating;
    }

    public String destination() {
        return instruction[3];
    }

    public void setTag(String tag) {
        this.instruction[3] = tag;
    }

    public OP getOpCode() {
        return opCode;
    }

    public void setOpCode(OP op) {
        this.opCode = op;
        switch (opCode) {
            case add:
                instruction[0] = "+";
                break;
            case sub:
            case neg:
                instruction[0] = "-";
                break;
            case mult:
                instruction[0] = "*";
                break;
            case div:
                instruction[0] = "/";
                break;
            case mod:
                instruction[0] = "%";
                break;
            case and:
                instruction[0] = "&&";
                break;
            case or:
                instruction[0] = "||";
                break;
            case copy:
                instruction[0] = "=";
                break;
            case not:
                instruction[0] = "!";
                break;
            case skip:
                instruction[0] = "skip";
                break;
            case ifLT:
                instruction[0] = "<";
                break;
            case ifLE:
                instruction[0] = "<=";
                break;
            case ifEQ:
                instruction[0] = "==";
                break;
            case ifNE:
                instruction[0] = "!=";
                break;
            case ifGE:
                instruction[0] = ">=";
                break;
            case ifGT:
                instruction[0] = ">";
                break;
            case jump:
                instruction[0] = "goto";
                break;
            case pmb:
                instruction[0] = "pmb";
                break;
            case call:
                instruction[0] = "call";
                break;
            case ret:
                instruction[0] = "rtn";
                break;
            case params:
                instruction[0] = "param_s";
                break;
            case st:
                instruction[0] = "store";
                break;
            case ind_ass:
            case ind_val:
                instruction[0] = " = ";
                break;
            default:
                break;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Instruction other = (Instruction) obj;
        if (!Arrays.equals(instruction, other.instruction))
            return false;
        return true;
    }
}
