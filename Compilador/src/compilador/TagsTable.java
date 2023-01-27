package compilador;

import java.util.ArrayList;

/**
 * Clase que sirve para almacenar las etiquetas que se generan.
 *
 *  @author Joan Campaner i Crist Alcázar
 */
public class TagsTable {
    private int ne; // Número de etiquetas
    private ArrayList<Tag> te; // Tabla de etiquetas

    public TagsTable() {
        this.ne = 0; // Al principio hay 0
        this.te = new ArrayList<Tag>();
    }

    public int newTag(boolean deproc) {
        ne++; // Aumenta el número de etiquetas
        te.add(new Tag(ne, deproc));
        return ne;
    }

    public Tag get(int tag) {
        return te.get(tag - 1);
    }

    public Tag get(String tag) {
        if (tag == null) {
            return null;
        }
        if (tag.equals("")) {
            return null;
        }
        return te.get(Integer.parseInt(tag.substring(1)) - 1);
    }
}
