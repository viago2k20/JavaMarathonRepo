package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static List<String> parseFileToStringList(List<String> input) {
        List<String> myList = new ArrayList<>();
        String[] number;

        for (String elements: input){
            number = elements.split(" ");
            if (Integer.parseInt((number[1])) < 0){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Неккоректный входной файл");
                }
            }else myList.add(elements);
        }
        return myList;
    }

    public static void main(String[] args) {
        File file = new File("people");
        Scanner scan;
        List<String> strList = new ArrayList<>();
        try {
            scan = new Scanner(file);
            while (scan.hasNextLine()) {
                strList.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
        System.out.println(parseFileToStringList(strList));
    }
}


////////