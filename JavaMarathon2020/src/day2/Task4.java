/**
 * Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число x.
 * Для этого числа, по формуле выше, необходимо вычислить значение y.
 *
 * (Для этих вещественных чисел x и y необходимо использовать тип double и метод nextDouble() у Scanner’а
 * соответственно, чтобы считать из консоли число x).
 * 
 * *Пояснение.
 * Формула для вычисления y содержит две составляющие - набор выражений для вычисления значения y и условие,
 * при котором то или иное выражение “срабатывает”. Выполнение того или иного условия зависит от значения x.
 * Например, если x = 100, будет использовано самое первое выражение. С помощью него, используя значение x будет
 * вычислено значение y.
 * y = (100^2 - 10) / (100 + 7) = 93.3644859813
 */
package day2;

import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        boolean firstCondition = (x >= 5);
        boolean secondCondition = (x > -3 && x < 5);

        if (firstCondition) {
            System.out.println((x * x - 10) / (x + 7));
        }
        if (secondCondition) {
            System.out.println((x + 3) * (x * x - 2));
        }
        if (!firstCondition && !secondCondition) {
            System.out.println("420");
        }
    }
}
