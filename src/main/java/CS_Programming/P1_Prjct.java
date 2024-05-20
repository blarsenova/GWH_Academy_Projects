package CS_Programming;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;

public class P1_Prjct {

    public static void main(String[] args) throws IOException {
        try {
            // pass the path to the file as a parameter
            File file = new File(
                    "/Users/baktygullarsenova/GWH Academy Projects/inputp1.txt");

            //Scanner class is used to read a file
            Scanner sc = new Scanner(file);
            String fileContent = " ";
            while (sc.hasNextLine())
                //below reads out the text inside
                fileContent = fileContent.concat(sc.nextLine() + "\n");

            System.out.println("This is the content of the file: " + fileContent);

            //class to write a number inside the file
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            //we might create an array here and give a condition until it is less than array's size, but let's leave it for food for thought
            for (int i = 1; i < 10; i++) {
                pw.println(i);
            }
            pw.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
 //I may need to brush up the code..
    public byte[] compress(byte[] data) {
        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
             DeflaterOutputStream deflater = new DeflaterOutputStream(out)) {

            deflater.write(data);
            deflater.finish();

            return out.toByteArray();
        } catch (Exception e) {
            System.out.println("error: " + e);
        }

        return new byte[0];
    }

    //@Override
    public byte[] decompress(byte[] compressedData) {
        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
             InflaterOutputStream inflater = new InflaterOutputStream(out)) {

            inflater.write(compressedData);
            inflater.finish();

            return out.toByteArray();
        } catch (Exception e) {
            System.out.println("error: " + e);
        }

        return new byte[0];
    }

    public void main() throws IOException {
        byte[] original = Files.readAllBytes(Paths.get("inputp1.txt"));
        byte[] compressed = compress(original);

        System.out.println("Original size: " + original.length);
        System.out.println("Compressed size: " + compressed.length);

        // byte[] decompressed = compressor.decompress(compressed);
        // System.out.println(Arrays.equals(original, decompressed));
    }
}

