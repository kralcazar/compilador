package compilador;

/**
 * La clase Tabla representa una tabla o 'array' y contiene la información
 * necesaria para verificar que se usan de forma correcta en los archivos que se
 * analizan.
 *
 * @author @gianm99
 */
public class Table {
    private Symbol.DataTypes dataTypes; // Tipo subyacente de la tabla
    private Index primero, ultimo; // Inicio y fin de lista de índices
    private int b; // Desplazamiento conocido en tiempo de compilación
    private int ocupacion; // Ocupación (bytes) de cada elemento
    private int dimensiones; // Número de dimensiones de la tabla
    private int entradas; // Número de entradas de la tabla

    public Table(Symbol.DataTypes dataTypes) {
        // TSub.NULL porque la tabla no tiene tipo subyacente
        this.dataTypes = dataTypes;
        this.primero = null;
        this.ultimo = null;
        this.ocupacion = 4; // Todos los tipos de datos ocupan 4 bytes
    }

    /**
     * Calcula el número de dimensiones que tiene la tabla.
     */
    public void calcularDimensiones() {
        int dimensiones = 0;
        Index i = primero;
        while (i != null) {
            dimensiones++;
            i = i.getNextIndex();
        }
        this.dimensiones = dimensiones;
    }

    /**
     * Calcula el número de entradas que tiene la tabla.
     */
    public void calcularEntradas() {
        int entradas = 0;
        Index i = primero;
        while (i != null) {
            entradas += i.d();
            i=i.getNextIndex();
        }
        this.entradas = entradas;
    }

    /**
     * Calcula el desplazamiento conocido en tiempo de compilación.
     */
    public void calcularB() {
        int b = 0;
        if (primero != null) {
            b = primero.li();
            Index i = primero.getNextIndex();
            while (i != null) {
                b = b * i.d() + i.li();
                i=i.getNextIndex();
            }
        }
        this.b = b;
    }

    /**
     * Añade un nuevo índice o dimensión a la tabla.
     */
    public void nuevoIndice(int li, int lf) {
        if (primero == null) {
            primero = new Index(li, lf);
            ultimo = primero;
        } else {
            ultimo.setNextIndex(new Index(li, lf));
            ultimo = ultimo.getNextIndex();
        }
    }

    /**
     * Devuelve el primer índice de la tabla.
     * 
     * @return El primer índice de la tabla.
     */
    public Index primerIndice() {
        return primero;
    }

    /**
     * Devuelve el tipo subyacente de los elementos de la tabla.
     * 
     * @return El tipo subyacente de los elementos de la tabla.
     */
    public Symbol.DataTypes tsubt() {
        return dataTypes;
    }

    /**
     * Devuelve el desplazamiento conocido en tiempo de compilación.
     * 
     * @return El desplazamiento conocido en tiempo de compilación.
     */
    public int b() {
        return b;
    }

    /**
     * Devuelve la ocupación (en bytes) de cada elemento de la tabla.
     * 
     * @return La ocupación de cada elemento de la tabla.
     */
    public int ocupacion() {
        return ocupacion;
    }

    /**
     * Devuelve el número de dimensiones de la tabla.
     * 
     * @return El número de dimensiones de la tabla.
     */
    public int dimensiones() {
        return dimensiones;
    }

    /**
     * Devuelve el número de entradas de la tabla. Una entrada es la unidad mínima o
     * celda de la tabla.
     * 
     * @return El número de entradas de la tabla.
     */
    public int entradas() {
        return entradas;
    }
}
