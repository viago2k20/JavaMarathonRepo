package day18;
/*
Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в этом массиве не используя
 циклы (необходимо использовать рекурсивные вызовы).
Пример:
int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
System.out.println(someMethod(...)); // 65346
*Вместо someMethod(...) должен быть ваш рекурсивный метод, который вернет сумму чисел в массиве numbers.
 */

public class Task1 {
    public static int solution(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        arr[0] += arr[n - 1];
        solution(arr, n - 1);
        return arr[0];
    }

    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        int[] numbers1 = {1, 10, 1241};
        int[] numbers2 = {1, 10};

        System.out.println(solution(numbers, numbers.length));
        System.out.println(solution(numbers1, numbers1.length));
        System.out.println(solution(numbers2, numbers2.length));

    }
}
