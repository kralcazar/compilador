package compilador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import compilador.Symbol.DataTypes;
import compilador.Symbol.Types;

/**
 * TablaVariable. Clase que sirve para almacenar las variables que aparecen en
 * el código.
 *
 */
public class VariablesTable {
    private ArrayList<Variable> tv;
    private int nv;
    private static Writer buffer;

    public VariablesTable(String directory) {
        tv = new ArrayList<Variable>();
        nv = 0;
    }

    public int newVar(boolean temporal, Integer proc, Types type, DataTypes datatypes) {
        Variable var;
        nv++;
        if (proc == null) {
            var = new Variable(nv, temporal, 0, type, datatypes);
        } else {
            var = new Variable(nv, temporal, proc, type, datatypes);
        }
        tv.add(var);
        return nv;
    }

    public void quitVar(String var) {
        String segments[] = var.split("\\$");
        tv.get(Integer.parseInt(segments[1]) - 1).setDeleted(true);
    }

    public void quitVar(ArrayList<Instruction> var) {
        int i = 0;
        while (i < var.size()) {
            if (get(var.get(i).destination()).datatypes() != DataTypes.STRING) {
                quitVar(var.get(i).destination());
                var.remove(i);
            } else {
                i++;
            }
        }
    }

    public Variable get(int nv) {
        return tv.get(nv - 1);
    }

    public Variable get(String var) {
        String segments[] = var.split("\\$");
        if (segments.length > 1) {
            return tv.get(Integer.parseInt(segments[1]) - 1);
        } else {
            return null;
        }
    }

    /**
     * Calcula el desp de todas las variables y el ocupVL de todos los
     * procedimientos.
     *
     * @param tp
     *               La tabla de procedimientos que actualiza.
     */
    public void calcDespOcupVL(ProceduresTable tp) {
        for (int p = 1; p <= tp.getNp(); p++) {
            tp.get(p).setOcupVL(0);
        }
        for (int x = 0; x < tv.size(); x++) {
            Variable vx = tv.get(x);
            int p = vx.proc();
            if (vx.type() == Types.VAR && p != 0) {
                if (vx.getNparam() == 0) {
                    int ocupx = vx.getOcup() * vx.getElements(); // Por las tablas
                    Procedure pp = tp.get(p);
                    pp.setOcupVL(pp.getOcupVL() + ocupx);
                    vx.setDesp(-pp.getOcupVL());
                } else {
                    vx.setDesp(8 + 4 * vx.getNparam());
                }
            }
        }
    }

    public int getNv() {
        return nv;
    }

    public void setNv(int nv) {
        this.nv = nv;
    }

    public void HTMLTable(String directorio) {
        try {
            File tsFile = new File(directorio);
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
            for (int i = 0; i < tv.size(); i++) {
                var = tv.get(i);
                table += "<tr style=\"background-color:";
                switch (var.datatypes()) {
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
                    if(var.datatypes()==DataTypes.BOOLEAN) {
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
                    table += "<td>" + var.datatypes() + "</td><td>" + var.toString() + "</td><td>"
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
