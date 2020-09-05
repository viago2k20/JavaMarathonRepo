package day12;
/*
Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
 Вывести список.
 */

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int i = 0;

        List<Integer> evenNumbers = new ArrayList<>();
        for (; i < 400; i++) {
            if (i % 2 == 0 && (i <=30 || (i >=300 && i<=350))) {
                evenNumbers.add(i);
            }
        }
        for (int evenList:evenNumbers
             ) {
            System.out.println(evenList);
        }
    }
}
