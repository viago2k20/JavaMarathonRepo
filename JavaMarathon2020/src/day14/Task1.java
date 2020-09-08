package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("textFileDay14");
        String stLine = null;
        String[] number = new String[0];
        try {
            Scanner scan = new Scanner(file);
            stLine = scan.nextLine();
            number = stLine.split(" ");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
        int sum = 0;
        for (String num : number) {
            sum += Integer.parseInt(num);
        }
        System.out.println("Сумма чисел из файла равна " + sum);
    }

}
