package CS_Programming;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class P1_with_Taalai {
    public static void main(String[] args) throws CompressionException {

        String inputFile = "/Users/baktygullarsenova/GWH Academy Projects/inputp1.txt";
        String outputFile = inputFile + ".sc";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
          //  ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(outputFile));
            ByteArrayOutputStream codedText = new ByteArrayOutputStream();

            Map<String, Short> wordToCode = new HashMap<>();
            Map<Short, String> codeToWords = new HashMap<>();

            short codeCounter = 0;
            String line;


            while ((line = reader.readLine()) != null) {
                String[] wordsInFile = line.split("\\s+");
                for (String w : wordsInFile) {
                    Short existingCode = wordToCode.get(w);

                    if (existingCode == null) {
                        wordToCode.put(w, codeCounter);
                        codeToWords.put(codeCounter, w);

                        byte high = (byte)(codeCounter>>>8);
                        byte low = (byte)codeCounter;
                        codedText.write(high);
                        codedText.write(low);

                        codeCounter++;

                        if (codeCounter == Short.MAX_VALUE) {
                            throw new CompressionException();
                        }
                    }
                }
                line = reader.readLine();
            }
    ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(outputFile));
        CompressionInfoFolder holder = new CompressionInfoFolder(codeToWords, codedText.toByteArray());
        writer.writeObject(holder);
        writer.flush();
            System.out.println("Number of words found: " + codeCounter);

        } catch (FileNotFoundException e) {
            System.out.println("Sorry, the file is not found to read: " + inputFile);
        } catch (IOException e) {
            System.out.println("Sorry, error encountered while reading a file: " + inputFile);
            e.printStackTrace();
        }
    }
}
