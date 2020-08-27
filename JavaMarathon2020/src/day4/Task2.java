/**
 * Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Затем, используя циклы for each вывести:
 * наибольший элемент массива
 * наименьший элемент массива
 * количество элементов массива, оканчивающихся на 0
 * сумму элементов массива, оканчивающихся на 0
 * <p>
 * Использовать сортировку запрещено.
 */

package day4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int max;
        int min;
        int endOfZero = 0;
        int sumEndOfZero = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива -> 100: ");
        int lengthArray = scan.nextInt();
        int[] myArray = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            myArray[i] = (int) Math.round(10000 * Math.random());
            System.out.print(myArray[i] + " ");
        }
        min = max = myArray[0]; //инициализация переменных
        for (int num : myArray) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            if (num % 10 == 0) {
                endOfZero++;
                sumEndOfZero += num;
            }
        }
        System.out.println("\n");
        System.out.println("Наибольший элемент массива " + max);
        System.out.println("Наименьший элемент массива " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + endOfZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumEndOfZero);
    }
}
