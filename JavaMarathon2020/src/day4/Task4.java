/**
 * Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной
 * суммой выведите значение суммы и индекс первого элемента тройки.
 *
 * Пример:
 * *Для простоты пример показан на массиве размера 10
 * [1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254]
 * Тройка с максимальной суммой: [5789, 4, 8742]
 *
 * Вывод в консоль:
 * 14535
 * 5
 */

package day4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int sum;
        int max = 0;
        int index = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива, например 100: ");
        int lengthArray = scan.nextInt();
        int[] myArray = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            myArray[i] = (int) Math.round(10000 * Math.random());
            System.out.print(myArray[i] + " ");
        }

        for (int j = 0; j < myArray.length-2; j++) {
            sum = myArray[j] + myArray[j + 1] + myArray[j + 2];
            if (sum > max) {
                max = sum;
                index = j;
            }
        }
        System.out.println(" ");
        System.out.println(max);
        System.out.println(index);
    }
}
