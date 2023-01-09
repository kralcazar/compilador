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
	private Types t;
	private DataTypes dataType;
	private boolean returnEncontrado;
	private String valor;
	private boolean inicializada;
	private int nv;
	private Procedure np;
	private Table table; // Descripción de tabla

	public enum Types {
		CONST, VAR, PROC, FUNC, ARG, NULO;
	}

	public enum DataTypes {
		BOOLEAN, INT, STRING, NULL;
	}

	public Symbol(String id, Symbol next, Types t, DataTypes dataType) {
		this.id = id;
		this.next = next;
		this.t = t;
		this.dataType = dataType;
	}

	public Symbol(Symbol s) {
		this.id = s.id;
		this.next = s.next;
		this.t = s.t;
		this.dataType = s.dataType;
	}

	public Symbol() {
	};

	public boolean isInicializada() {
		return inicializada;
	}

	public void setInicializada(boolean inicializada) {
		this.inicializada = inicializada;
	}

	public Procedure getNp() {
		return np;
	}

	public void setNp(Procedure np) {
		this.np = np;
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

	public Types getT() {
		return t;
	}

	public void setT(Types t) {
		this.t = t;
	}

	public DataTypes dataType() { return dataType; }

	public boolean isReturnEncontrado() {
		return returnEncontrado;
	}

	public void setReturnEncontrado(boolean returnEncontrado) {
		this.returnEncontrado = returnEncontrado;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public int getNv() {
		return nv;
	}

	public void setNv(int nv) {
		this.nv = nv;
	}

	public Table getTuple() {
		return table;
	}

	public void setTuple(Table table) {
		this.table = table;
	}
}
