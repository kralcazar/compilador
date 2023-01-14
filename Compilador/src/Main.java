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
        if(args.length==0) {
            System.out.println("Argumentos necesarios no encontrados");
            return;
        }
        //String file = System.getProperty("user.dir") + "\\programas\\test.esl";
        //String buildPath = System.getProperty("user.dir") + "\\programas\\test.esl";
        // Nombre del archivo procesado
        String filename = FilenameUtils.getBaseName(args[0]);
        String buildPath = System.getProperty("user.dir") + "\\programas\\" + filename + "\\";
        File buildDir = new File(buildPath);
        if (!buildDir.mkdirs()) {
            FileUtils.cleanDirectory(buildDir);
        }
        System.out.println("Leyendo "+args[0]);
        CharStream stream = CharStreams.fromFileName(System.getProperty("user.dir") + "\\programas\\" + args[0]);

        // Se obtienen los tokens a partir de la gramática
        eGramLexer lexer = new eGramLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        File tokensFile = new File(buildPath + "tokens.txt");
        try (Writer buffer = new BufferedWriter(new FileWriter(tokensFile))) {
            for (Token tok : tokens.getTokens()) {
                buffer.write(tok.getText() + '\n');
                System.out.println(tok.getText());
            }
            buffer.close();
        }


        // Análisis del código fuente
        eGramParser parser = new eGramParser(tokens);
        try {
            tokens.seek(0);
            parser.program();
            System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT
                    + "Proceso de análisis completado con éxito" + ConsoleColors.RESET);
        } catch (RuntimeException e) {
            System.out.println("Se encontraron errores en el código:");
            System.out.println(ConsoleColors.RED_BOLD + e.getMessage() + ConsoleColors.RESET);
            File erroresFile = new File(buildPath + "errores.txt");
            Writer buffer = new BufferedWriter(new FileWriter(erroresFile));
            if (e != null) {
                buffer.write(e.getMessage());
            }
            buffer.close();
            return;
        }

        //Generación del código intermedio

    }
}