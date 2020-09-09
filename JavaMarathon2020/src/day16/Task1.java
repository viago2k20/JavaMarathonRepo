package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("textFileDay16");
        String stLine;
        String[] number = new String[0];
        try {
            Scanner scan = new Scanner(file);
            stLine = scan.nextLine();
            number = stLine.split(" ");
//            if (number.length != 10)
//                try {
//                    throw new IOException();
//                } catch (IOException e) {
//                    System.out.println("Неккоректный входной файл");
//                }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
        double sum = 0;
        for (String num : number) {
            sum += Integer.parseInt(num);
        }
        System.out.format("Среднее арифметическое чисел : %.15f  -->  %.3f  ", sum / number.length, sum / number.length);

    }

}

