package CS_Programming;

import java.io.File;
import java.util.Scanner;

public class P1_Prjct {

    public static void main(String[] args) throws Exception
    {
        // pass the path to the file as a parameter
        File file = new File(
                "/Users/baktygullarsenova/GWH Academy Projects/inputp1.txt");

        //Scanner class is used to read a file
        Scanner sc = new Scanner(file);
        String fileContent = " ";
        while (sc.hasNextLine())
            //below reads out the text inside
            fileContent=fileContent.concat(sc.nextLine() +"\n");
            System.out.println("This is the content of the file: " + fileContent);
    }
}
