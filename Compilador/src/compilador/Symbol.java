package compilador;

/**
 * Simbolo. Clase que sirve para gestionar la información relacionada con los
 * símbolos que aparecen en el código fuente.
 * 
 * @author Gian Lucas Martín Chamorro
 * @author Jordi Antoni Sastre Moll
 */
public class Symbol {
	private String id;
	private Symbol next;
	private Types type;
	private DataTypes dataType;
	private boolean returnFound;
	private String value;
	private boolean initialized;
	private int variableNumber;
	private Procedure procedure;
	private Table table; // Descripción de tabla

	public enum Types {
		CONST, VAR, PROC, FUNC, ARG, MAIN, NULL;
	}

	public enum DataTypes {
		BOOLEAN, INT, STRING, NULL;
	}

	public Symbol(String id, Symbol next, Types type, DataTypes dataType) {
		this.id = id;
		this.next = next;
		this.type = type;
		this.dataType = dataType;
	}

	public Symbol(Symbol s) {
		this.id = s.id;
		this.next = s.next;
		this.type = s.type;
		this.dataType = s.dataType;
	}

	public Symbol() {
	};

	public boolean isInitialized() {
		return initialized;
	}

	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}

	public Procedure getProcedure() {
		return procedure;
	}

	public void setProcedure(Procedure procedure) {
		this.procedure = procedure;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Symbol getNext() {
		return next;
	}

	public void setNext(Symbol next) {
		this.next = next;
	}

	public Types getType() {
		return type;
	}

	public void setType(Types type) {
		this.type = type;
	}

	public DataTypes dataType() { return dataType; }

	public boolean isReturnFound() {
		return returnFound;
	}

	public void setReturnFound(boolean returnFound) {
		this.returnFound = returnFound;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getVariableNumber() {
		return variableNumber;
	}

	public void setVariableNumber(int variableNumber) {
		this.variableNumber = variableNumber;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}
}
