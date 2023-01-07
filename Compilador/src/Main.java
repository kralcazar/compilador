import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Trying to read a txt file");
        System.out.println(System.getProperty("user.dir") + "\\programas\\test.txt");

        try {
            File program = new File(System.getProperty("user.dir") + "\\programas\\test.esl");
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
    }
}