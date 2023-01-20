package compilador;

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
            if (get(var.get(i).destination()).getDataType() != DataTypes.STRING) {
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

    public ArrayList<Variable> getTv(){ return tv; }

}
