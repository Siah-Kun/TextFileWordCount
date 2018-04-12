import java.util.Scanner;
import java.io.File;

public class WordCount {

    public static void main(String args[]) throws Exception{
        File file = new File("A Tale of Two Cities.txt");
        Scanner scanner = new Scanner(file);

        int wordcount = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            wordcount += line.split(" ").length;
        }
        System.out.println("This file contains " + wordcount + " words");
    }
}
