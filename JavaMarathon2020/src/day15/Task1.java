package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        File fileIn = new File("shoes.csv");
        File fileOut = new File("noShoes");
        PrintWriter pw = new PrintWriter(fileOut);
        Scanner scan = new Scanner(fileIn);
        List<String> shoesList = new ArrayList<>();
        while (scan.hasNextLine()) {
            //shoesList.add(scan.nextLine());
            shoesList.add(scan.nextLine());
        }
        String [] myArr;
        for(String elements:shoesList){
            myArr =  elements.split(";");
            if(Integer.parseInt(myArr[2])==0){
                pw.println(myArr[0] + ", "+ myArr[1] + ", " + myArr[2]);
                //pw.println(myArr[0] + ", "+ myArr[1] + ", " + myArr[2]);
                //System.out.println(elements);
            }

        }
        pw.close();



    }
}
