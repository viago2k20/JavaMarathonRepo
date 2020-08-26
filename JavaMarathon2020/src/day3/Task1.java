/**
 * Реализовать программу, которая в консоль выводит название страны, принимая на вход название города.
 * Программа должна работать до тех пор, пока не будет введено слово “Stop”.
 * Реализовать, используя следующие данные: Москва, Владивосток, Ростов - Россия. Рим, Милан, Турин - Италия.
 * Ливерпуль, Манчестер, Лондон - Англия. Берлин, Мюнхен, Кёльн - Германия.
 * При вводе любого другого города вывести сообщение “Неизвестная страна”.
 * Пример:
 * Милан - ваш ввод в консоль
 * Италия - ответ программы
 * Дублин - ваш ввод в консоль
 * Неизвестная страна - ответ программы
 * Stop - ваш ввод в консоль
 * работа программы завершается
 */
package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 1;
        while (true) {
            String input = scan.nextLine().toLowerCase();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            switch (input) {
                case "москва":
                case "младивосток":
                case "ростов":
                    System.out.println("Россия");
                    break;
                case "рим":
                case "милан":
                case "турин":
                    System.out.println("Италия");
                    break;
                case "ливерпуль":
                case "манчестер":
                case "лондон":
                    System.out.println("Англия");
                    break;
                case "берлин":
                case "мюнхен":
                case "кельн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
            i++;
        }
    }
}
