package compilador;

/**
 * La clase Tabla representa una tabla o 'array' y contiene la información
 * necesaria.
 *
 * @author Joan Campaner i Crist Alcázar
 */
public class Table {
    private Symbol.DataTypes dataType; // Tipo subyacente de la tabla
    private Index first, last; // Inicio y fin de lista de índices
    private int offset; // Desplazamiento conocido en tiempo de compilación
    private int itemSize; // Ocupación (bytes) de cada elemento
    private int dimension; // Número de dimensiones de la tabla
    private int entries; // Número de entradas de la tabla

    public Table(Symbol.DataTypes dataType) {
        // dataType.NULL porque la tabla no tiene tipo subyacente
        this.dataType = dataType;
        this.first = null;
        this.last = null;
        this.itemSize = 4; // Todos los tipos de datos ocupan 4 bytes
    }

    /**
     * Inicializa los parámetros de la tabla
     */
    public void init(){
        setDimension();
        setOffset();
        setEntries();
    }
    /**
     * Calcula el número de dimensiones que tiene la tabla.
     */
    private void setDimension() {
        int dim = 0;
        Index i = first;
        while (i != null) {
            dim++;
            i = i.getNextIndex();
        }
        this.dimension = dim;
    }

    /**
     * Calcula el número de entradas que tiene la tabla.
     */
    private void setEntries() {
        int entradas = 0;
        Index i = first;
        while (i != null) {
            entradas += i.getDimension();
            i=i.getNextIndex();
        }
        this.entries = entradas;
    }

    /**
     * Calcula el desplazamiento conocido en tiempo de compilación.
     */
    private void setOffset() {
        int b = 0;
        if (first != null) {
            b = first.li();
            Index i = first.getNextIndex();
            while (i != null) {
                b = b * i.getDimension() + i.li();
                i = i.getNextIndex();
            }
        }
        this.offset = b;
    }

    /**
     * Añade un nuevo índice o dimensión a la tabla.
     */
    public void setIndex(int bottomLimit, int upperLimit) {
        if (first == null) {
            first = new Index(bottomLimit, upperLimit);
            last = first;
        } else {
            last.setNextIndex(new Index(bottomLimit, upperLimit));
            last = last.getNextIndex();
        }
    }

    /**
     * Devuelve el primer índice de la tabla.
     * 
     * @return El primer índice de la tabla.
     */
    public Index getFirst() {
        return first;
    }

    /**
     * Devuelve el tipo subyacente de los elementos de la tabla.
     * 
     * @return El tipo subyacente de los elementos de la tabla.
     */
    public Symbol.DataTypes dataType() {
        return dataType;
    }

    /**
     * Devuelve el desplazamiento conocido en tiempo de compilación.
     * 
     * @return El desplazamiento conocido en tiempo de compilación.
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Devuelve la ocupación (en bytes) de cada elemento de la tabla.
     * 
     * @return La ocupación de cada elemento de la tabla.
     */
    public int getItemSize() {
        return itemSize;
    }

    /**
     * Devuelve el número de dimensiones de la tabla.
     * 
     * @return El número de dimensiones de la tabla.
     */
    public int getDimension() {
        return dimension;
    }

    /**
     * Devuelve el número de entradas de la tabla. Una entrada es la unidad mínima o
     * celda de la tabla.
     * 
     * @return El número de entradas de la tabla.
     */
    public int getEntries() {
        return entries;
    }
}
