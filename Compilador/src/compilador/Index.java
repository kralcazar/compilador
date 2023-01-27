package compilador;

/**
 * La clase Indice representa un índice de una tabla y contiene la información
 * relacionada.
 * 
 * @author Joan Campaner i Crist Alcázar
 */
public class Index {
    private int li; // Límite inferior
    private int lf; // Límite superior
    private int dimension; // Dimensión del índice
    private Index nextIndex; // Puntero al siguiente índice

    Index(int li, int lf) {
        this.li = li;
        this.lf = lf;
        this.dimension = lf - li + 1;
        this.nextIndex = null;
    }

    /**
     * Devuelve el siguiente índice.
     * 
     * @return El siguiente índice.
     */
    public Index getNextIndex() {
        return nextIndex;
    }

    /**
     * Asigna el siguiente índice.
     * 
     * @param index
     *                   El índice siguiente al actual.
     */
    public void setNextIndex(Index index) {
        this.nextIndex = index;
    }

    /**
     * Devuelve el límite inferior.
     * 
     * @return El límite inferior
     */
    public int li() {
        return li;
    }

    /**
     * Devuelve el límite superior.
     * 
     * @return El límite superior.
     */
    public int lf() {
        return lf;
    }

    /**
     * Devuelve la dimensión del índice.
     * 
     * @return La dimensión del índice.
     */
    public int getDimension() {
        return dimension;
    }
}
