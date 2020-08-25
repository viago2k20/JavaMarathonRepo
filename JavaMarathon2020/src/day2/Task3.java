/**
 *
 *Реализовать программу №2, используя цикл while.
 */

package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int i = a + 1;
        while (i < b) {
            boolean check = (i % 5 == 0) && (i % 10 != 0);
            if (check) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
