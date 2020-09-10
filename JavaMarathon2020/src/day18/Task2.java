package day18;
/*
Создайте рекурсивный метод, который принимает на вход единственный аргумент - число, и возвращает
 количество цифр 7 в этом числе. Циклы использовать запрещено, можно использовать только рекурсивные вызовы.
Пример:
System.out.println(count7(717771237)); // 5
*В числе 717771237 ровно 5 раз используется цифра семь.

 */

public class Task2 {
    public static int count7(int number) {
        if (number % 10 == 0)
            return 0;
        int i = 0;
        if (number % 10 == 7){
            i++;
        }
        return count7(number / 10) + i;
    }
    public static void main(String[] args) {
        System.out.println(count7(717771237));

    }
}
