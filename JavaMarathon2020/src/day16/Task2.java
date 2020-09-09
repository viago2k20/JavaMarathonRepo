package day16;
/*
Реализовать программу, записывающую числа разных типов в 2 файла.
Файл 1 содержит 1000 случайных чисел от 0 до 100.
Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается их
среднее арифметическое. Затем, полученное значение записывается в Файл 2. Таким образом в Файле 2 будет
 находиться 50 вещественных чисел (1000 / 20 = 50).
После того, как Файл 2 будет сформирован, необходимо найти сумму всех вещественных чисел из Файла 2 и вывести
 в консоль ответ, отбросив его вещественную часть.
Пример:
Для простоты, в Файле 1 находится 12 целых чисел, а среднее арифметическое рассчитывается для группы из 4 целых чисел.

Файл 1: 3 8 7 5 28 73 4 1 5 32 89 12
Файл 2: 5.75 26.5 34.5
Ответ: 66

Комментарии к примеру:
Среднее арифметическое для четверки 3 8 7 5 равно 5.75
Таким же образом рассчитаны средние арифметические для остальных четверок из Файла 1.
Сумма вещественных чисел из Файла 2 равняется 66.75
Отбросив вещественную часть (числа после запятой) получаем ответ 66.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileOne = new File("FileOneDay16");
        File fileTwo = new File("FileTwoDay16");
        PrintWriter pwToOne = new PrintWriter(fileOne);
        PrintWriter pwToTwo = new PrintWriter(fileTwo);

        int count = 0;
        int x;
        int y = 1000;//количество чисел
        while (count < y) {
            x = (int) Math.round(10 * Math.random());
            //System.out.print(x + " ");
            pwToOne.print(x + " ");//запись чисел в файл FileOneDay16
            count++;
        }
        pwToOne.close();
        //System.out.println("");

        Scanner scan = new Scanner(fileOne);// <-- в сканнере указываем имя файла из которого считываем инфу!
        String stLine = scan.nextLine();
        String[] number = stLine.split(" ");
        scan.close();
        for (int i = 0; i < y; i = i + 20) {
            double sum = 0;
            for (int j = i; j < (i + 20); j++) {
                sum += (double) Integer.parseInt(number[j]);
            }
            //System.out.print(sum + " ");
            pwToTwo.print(sum/20 + " ");//запись чисел в файл FileTwoDay16
        }
        pwToTwo.close();

        Scanner sc = new Scanner(fileTwo);
        String myLine = sc.nextLine();
        sc.close();
        String[] myNumber = myLine.split(" ");
        double result = 0;
        for (String num : myNumber) {
            //System.out.format(num + " ");
            result = (result + Double.parseDouble(num));
        }
        //System.out.println("\n");
        System.out.println((int)result);
    }
}
