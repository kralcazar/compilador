package compilador;

/**
 * Variable. Clase que sirve para gestionar las variables que aparecen en el
 * código fuente.
 *
 */
public class Variable {
    private int variableNumber; // Número de variable
    private boolean temporal; // Si la variable es temporal
    private int proc; // Número del procedimiento que la ha declarado
    private Symbol.Types type; // Tipo: variable o constante
    private Symbol.DataTypes dataType; // Tipo subyacente
    private String id; // Identificador de la variable (t si es temporal)
    private String value; // Valor para constantes
    private int ocup; // Ocupación de la variable
    private int desp; // Desplazamiento en el ámbito local
    private int nparam; // Número de parámetro
    private boolean deleted; // Si la variable ha sido borrada
    private int elements; // Es 1 a menos que sea una tabla. Para tablas puede ser mayor.

    public Variable(int variableNumber, boolean temporal, int proc, Symbol.Types type, Symbol.DataTypes dataType) {
        this.variableNumber = variableNumber;
        this.temporal = temporal;
        this.proc = proc;
        this.type = type;
        this.dataType = dataType;
        if (temporal) {
            id = "t";
        }
        this.ocup = 4; // 32 bits
        this.deleted = false;
        this.desp = 0;
        this.nparam = 0; // Por defecto es 0. Si es un parámetro se actualizará.
        this.elements = 1; // Por defecto es 1
    }

    public int getElements() {
        return elements;
    }

    public void setElements(int elements) {
        this.elements = elements;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public int getNparam() {
        return nparam;
    }

    public void setNparam(int nparam) {
        this.nparam = nparam;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Symbol.DataTypes getDataType() {
        return dataType;
    }

    public boolean temporal() {
        return temporal;
    }

    public int nv() {
        return variableNumber;
    }

    public Symbol.Types type() {
        return type;
    }

    public int proc() {
        return proc;
    }

    @Override
    public String toString() {
        return id + "$" + variableNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOcup() {
        return ocup;
    }

    public void setOcup(int ocup) {
        this.ocup = ocup;
    }

    public int getDesp() {
        return desp;
    }

    public void setDesp(int desp) {
        this.desp = desp;
    }

    public boolean isTemporal() {
        return temporal;
    }

    public void setTemporal(boolean temporal) {
        this.temporal = temporal;
    }
}
