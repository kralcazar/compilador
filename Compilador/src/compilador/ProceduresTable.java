package compilador;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Clase que sirve para almacenar los procedimientos.
 *
 * @author Joan Campaner i Crist Alcázar
 */

public class ProceduresTable {
    private ArrayList<Procedure> tp;
    private int np;

    public ProceduresTable() {
        tp = new ArrayList<Procedure>();
        np = 0;
    }

    public Procedure newProc(int prof, Symbol.Types type, String id) {
        np++;
        tp.add(new Procedure(np, prof, type, id));
        return tp.get(tp.size() - 1);
    }

    public Procedure get(int np) {
        return tp.get(np - 1);
    }

    public Procedure get(String proc) {
        String segments[] = proc.split("\\$");
        return tp.get(Integer.parseInt(segments[1]) - 1);
    }

    public ArrayList<Procedure> getTP() {
        return tp;
    }

    public void setTP(ArrayList<Procedure> tP) {
        this.tp = tP;
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }

}
