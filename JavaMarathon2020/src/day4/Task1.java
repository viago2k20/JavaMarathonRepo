/**
 * С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить
 * его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль, а также вывести
 * в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 *
 * Пример:
 * Введено число 10. Сгенерирован следующий массив:
 * [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
 *
 * Информация о массиве:
 * Длина массива: 10
 * Количество чисел больше 8: 1
 * Количество чисел равных 1: 0
 * Количество четных чисел: 6
 * Количество нечетных чисел: 4
 * Сумма всех элементов массива: 46
 */
package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int moreThan8 = 0;
        int equal1 = 0;
        int oddNumber = 0;
        int evenNumber = 0;
        int sumOfNumber = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int lengthArray = scan.nextInt();
        int[] myArray = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            myArray[i] = (int) Math.round(10 * Math.random());
            if (myArray[i] > 8) {
                moreThan8++;
            }
            if (myArray[i] == 1) {
                equal1++;
            }
            if (myArray[i] % 2 != 0) {
                oddNumber++;
            }
            if (myArray[i] % 2 == 0) {
                evenNumber++;
            }
            sumOfNumber += myArray[i];
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\n");
        System.out.println(Arrays.toString(myArray));
        System.out.println("Длина массива: " + myArray.length);
        System.out.println("Количество чисел больше восьми: " + moreThan8);
        System.out.println("Количество чисел равных 1: " + equal1);
        System.out.println("Количество четных чисел: " + evenNumber);
        System.out.println("Количество нечетных чисел: " + oddNumber);
        System.out.println("Сумма всех элементов массива:" + sumOfNumber);
    }
}
