package compilador;

/**
 * La clase Tag que sirve para etiquetar el código de tres direcciones.
 *
 * @author Joan Campaner i Crist Alcázar
 */
public class Tag {
    private int ne; // Número de etiqueta
    private int line; // Número de línea
    private boolean deproc; // Si es la etiqueta de inicio de un procedimiento

    public Tag(int ne, boolean deproc) {
        this.ne = ne; // Asigna el número de etiqueta
        this.deproc = deproc;
        this.line= 0; // Al principio la línea no está asignada
    }

    public static int get(String tag) {
        return Integer.parseInt(tag.substring(1));
    }

    public int getNe() {
        return ne;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "e" + ne;
    }

    public boolean isDeproc() {
        return deproc;
    }

    public void setDeproc(boolean deproc) {
        this.deproc = deproc;
    }
}
