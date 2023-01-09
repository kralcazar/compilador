import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.*;
import java.util.Scanner; // Import the Scanner class to read text files
import org.antlr.v4.runtime.*;
import org.apache.commons.io.*;
import java.io.*;
import org.antlr.v4.runtime.CommonTokenStream;
import gram.*;
import compilador.*;

public class Main {
    public static void main(String[] args) throws Exception  {
        System.out.println("Hello world!");
        System.out.println("Trying to read a txt file");
        System.out.println(System.getProperty("user.dir") + "\\programas\\test.txt");
        String file = System.getProperty("user.dir") + "\\programas\\test.esl";
        String buildPath = "pruebas\\final\\" + "prueba" + "\\";

        try {
            File program = new File(file);
            Scanner myReader = new Scanner(program);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        CharStream stream = CharStreams.fromFileName(file); //TODO: Da error cuando el parametro contiene una ruta al archivo del programa

        // Se obtienen los tokens a partir de la gramática
        eGramLexer lexer = new eGramLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.println(tokens);
        tokens.fill();
        File tokensFile = new File(buildPath + "tokens.txt");
        try (Writer buffer = new BufferedWriter(new FileWriter(tokensFile))) {
            for (Token tok : tokens.getTokens()) {
                buffer.write(tok.getText() + '\n');
            }
            buffer.close();
        }
    }
}