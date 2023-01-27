package compilador;

/**
 * Procedmiento. Clase que sirve para gestionar los procedimientos que aparecen
 * en el código fuente.
 * 
 * @author Joan Campaner i Crist Alcázar
 */
public class Procedure {

    private String id;
    private int np; // Número de procedimiento
    private int prof; // Nivel de la declaración
    private int startTag; // Etiqueta de inicio
    private int numParams; // Número de parámetros
    private int ocupVL; // Ocupación de las variables locales
    private Symbol.Types type; // Función o Procedimiento

    public Procedure(int np, int prof, Symbol.Types type, String id) {
        this.np = np;
        this.type = type;
        this.setProf(prof);
        this.numParams = 0;
        this.id = id;
    }

    public int getProf() {
        return prof;
    }

    public void setProf(int prof) {
        this.prof = prof;
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }

    public int getStartTag() {
        return startTag;
    }

    public void setStartTag(int startTag) {
        this.startTag = startTag;
    }

    public Symbol.Types getType() {
        return type;
    }

    public void setType(Symbol.Types type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return id + "$" + np;
    }

    public int getNumParams() {
        return numParams;
    }

    public void setNumParams(int numParams) {
        this.numParams = numParams;
    }

    public int getOcupVL() {
        return ocupVL;
    }

    public void setOcupVL(int ocupVL) {
        this.ocupVL = ocupVL;
    }
}
