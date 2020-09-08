package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static List<Person> parseFileToObjList(List<String> input) {

        List<Person> myListPerson = new ArrayList<>();
        String[] number;
        for (String elements : input) {
            number = elements.split(" ");
            if (Integer.parseInt((number[1])) < 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Неккоректный входной файл");
                }
            } else myListPerson.add(new Person(number[0], Integer.parseInt(number[1])));
        }
        return myListPerson;
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
        System.out.println(parseFileToObjList(strList));
    }
}
