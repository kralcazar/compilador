package compilador;

import java.util.ArrayList;
import java.util.Hashtable;
import java.io.*;

/**
 * TablaSimbolos. Clase que sirve para gestionar los símbolos que aparecen en el
 * código fuente.
 * 
 * @author Gian Lucas Martín Chamorro
 * @author Jordi Antoni Sastre Moll
 */
public class SymbolTable {

    private Hashtable<String, Symbol> hashTable;
    private int level;
    private int lastBlock;
    private SymbolTable pre;
    private static Writer buffer;
    private ArrayList<SymbolTable> blockTable;


    public class SymbolTableException extends Exception {

        private static final long serialVersionUID = 7706912154843705180L;

        public SymbolTableException(String msg) {
            super(msg);
        }
    }

    public SymbolTable(String folder) {
        level = 0;
        hashTable = new Hashtable<>();
        blockTable = new ArrayList<SymbolTable>();
        pre = null;
        try {
            // ST output
            File tsFile = new File(folder + "/SymbolTable.html");
            buffer = new BufferedWriter(new FileWriter(tsFile));
            buffer.write(
                    "<!DOCTYPE html><html><head><head><style>table, th, td {  border: 1px solid\n"
                            + " black;  border-collapse: collapse;}th, td {padding: 5px;text-align:\n"
                            + " center;}</style>" + "</head>" + "<body style >"
                            + "<table style=\"width:100%; \n"
                            + "background-color:#DDDDDD; font-family:'Courier New'\">" + "<tr>"
                            + "<th>Nivel " + level + "</th>" + "<td>"
                            + "<table style=\"width:100%; \n"
                            + "background-color:#DDDDDD; font-family:'Courier New'\">" + "<tr>"
                            + "<th>Id</th>" + "<th>Tipo</th>" + "<th>Tipo Subyacente</th>"
                            + "<th>Next</th>" + "</tr>" + "<tr>\n");
        } catch (IOException e) {
            System.out.println("error escribiendo la tabla de símbolos: " + e.getMessage());
        }
    }

    private SymbolTable(SymbolTable p, int n) {
        level = n;
        hashTable = new Hashtable<>();
        blockTable = new ArrayList<>();
        pre = p;
    }

    public SymbolTable blockIn() {
        try {
            // TS entre bloque output
            buffer.write("</tr>" + "</table>" + "</td>" + "</tr>" + "<tr>" + "<th>Nivel "
                    + (level + 1) + "</th>" + "<td>" + "<table style=\"width:100%; \n"
                    + "background-color:#DDDDDD; font-family:'Courier New'\">" + "<tr>"
                    + "<th>Id</th>" + "<th>Tipo</th>" + "<th>Tipo Subyacente</th>" + "<th>Next</th>"
                    + "</tr>" + "<tr>\n");
        } catch (IOException e) {
            System.out.println("error escribiendo la tabla de símbolos: " + e.getMessage());
        }
        SymbolTable tabla = new SymbolTable(this, level + 1);
        this.blockTable.add(tabla);
        return tabla;
    }

    public SymbolTable blockGoesDown() throws SymbolTableException {
        if (lastBlock > this.blockTable.size()) {
            throw new SymbolTableException(
                    "posicion incorrecta de la lista de las tablas de bloques inferiores");
        }
        return blockTable.get(lastBlock);
    }

    public SymbolTable blockOut() {
        level--;
        try {
            if (level == -1) {
                // TS acaba de escribir
                buffer.write("</tr>" + "</table>" + "</td>" + "</tr>" + "</table>" + "</body>"
                        + "</html>\n");
                buffer.close();
            } else {
                // TS reduce un nivel en el bloque
                buffer.write("</tr>" + "</table>" + "</td>" + "</tr>" + "<tr>" + "<th>Nivel "
                        + level + "</th>" + "<td>" + "<table style=\"width:100%; \n"
                        + "background-color:#DDDDDD; font-family:'Courier New'\">" + "<tr>"
                        + "<th>Id</th>" + "<th>Tipo</th>" + "<th>Tipo Subyacente</th>"
                        + "<th>Next</th>" + "</tr>" + "<tr>\n");
            }
        } catch (IOException e) {
            System.out.println("error escribiendo la tabla de símbolos: " + e.getMessage());
        }
        return pre;
    }

    public SymbolTable blockGoesUp() {
        return pre;
    }

    public void insert(String id, Symbol s) throws SymbolTableException {
        if (this.exists(id)) {
            throw new SymbolTableException("identificador repetido: " + id);
        }
        hashTable.put(id, s);
        try {
            // Escribir en la tabla de símbolos
            buffer.write("<td>" + s.getId() + "</td>" + "<td>" + s.getType() + "</td>" + "<td>"
                    + s.dataType() + "</td>\n");
            if (s.getNext() != null) {
                Symbol sn = s.getNext();
                buffer.write("<td>" + "<table style=\"width:100%; \n"
                        + "background-color:#DDDDDD; font-family:'Courier New'\">" + "<tr>"
                        + "<th>Id</th>" + "<th>Tipo</th>" + "<th>Tipo Subyacente</th>" + "</tr>"
                        + "<tr>\n");
                while (sn != null) {
                    buffer.write("<td>" + sn.getId() + "</td>" + "<td>" + sn.getType() + "</td>"
                            + "<td>" + sn.dataType() + "</td></tr>\n");
                    sn = sn.getNext();
                }
                buffer.write("</table>" + "</td>\n");
            } else {
                buffer.write("<td>" + "null" + "</td>\n");
            }
            buffer.write("</tr>" + "<tr>\n");
        } catch (IOException e) {
            System.out.println("error escribiendo la tabla de símbolos: " + e.getMessage());
        }

    }

    private boolean exists(String id) {
        return this.hashTable.get(id) != null;
    }

    public Symbol get(String id) throws SymbolTableException {
        for (compilador.SymbolTable ts = this; ts != null; ts = ts.pre) {
            if (ts.hashTable.get(id) != null) {
                return ts.hashTable.get(id);
            }
        }
        throw new SymbolTableException(
                "no se ha encontrado el símbolo " + id + " en la tabla de símbolos");
    }
}
