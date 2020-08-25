/**
 Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner,
 число, соответствующее количеству этажей в здании. Используя условный оператор if,
 необходимо вывести в консоль сообщение о типе такого дома.

 Условия: если этажей 1-4  - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более - “Многоэтажный дом”.
 Так же, необходимо учесть что может быть введено отрицательное значение.
 В таком случае сообщить о некорректности ввода.
 **/

package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Введите количество этажей:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        boolean incorrectNumber = false;
        boolean fromOneToFour = num >= 1 && num <= 4;
        boolean fromFiveToEight = num >= 5 && num <= 8;
        boolean fromNine = num >= 9;

        if(fromOneToFour){
            System.out.println("Малоэтажный дом");
            incorrectNumber = true;
        }
        if(fromFiveToEight){
            System.out.println("Среднеэтажный дом");
            incorrectNumber = true;
        }
        if(fromNine){
            System.out.println("Многоэтажный дом");
            incorrectNumber = true;
        }
        if(!incorrectNumber){
            System.out.println("Вы ввели некорректное число!");
        }
    }
}
