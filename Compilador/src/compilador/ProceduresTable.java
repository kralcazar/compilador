package compilador;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * TablaProcedimientos. Clase que sirve para almacenar los procedimientos que
 * aparecen en el código.
 *
 */
public class ProceduresTable {
    private ArrayList<Procedure> tp;
    private int np;
    private static Writer buffer;

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

    // Getters y setters
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

    public void HTMLTable(String directory) {
        try {
            File tsFile = new File(directory);
            buffer = new BufferedWriter(new FileWriter(tsFile));
            String table = "<!DOCTYPE html><html><head><head><style>table, th, td {  border: 1px solid black;  border-collapse: collapse;}th, td {  padding: 5px;  text-align: center;}</style></head><body><table style=\"width:100%; background-color:#727272; font-family:'Courier New'\"><tr style=\"color:white\"><th>tipo</th><th>nombre</th><th>prof</th><th>inicio</th><th>numParams</th><th>ocupVL</th></tr>";
            Procedure proc;
            String start, numParams;
            for (int i = 0; i < tp.size(); i++) {
                proc = tp.get(i);
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
}
