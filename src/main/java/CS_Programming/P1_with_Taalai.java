package CS_Programming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P1_with_Taalai {
    public static void main(String[] args) {
        String inputFile = "/Users/baktygullarsenova/GWH Academy Projects/inputp1.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] wordsInFile = line.split("\\s+");
                for (String w:wordsInFile){
                    System.out.println(w);
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, the file is not found to read: " + inputFile);
        } catch (IOException e) {
            System.out.println("Sorry, error encountered while reading a file: " + inputFile);
        }
    }
}
