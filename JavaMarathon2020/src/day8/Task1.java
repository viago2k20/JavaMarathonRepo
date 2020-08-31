/**
 * Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка,
 * полученная конкатенацией (“склеиванием”) чисел из диапазона через
 * пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
 * После создания такой строки, вызов System.out.println() на этой строке должен вывести
 * в консоль сразу все числа из диапазона:
 * 0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
 * <p>
 * Для того, чтобы почувствовать разницу в производительности между конкатенацией
 * обычных строк (класс String) и использовании StringBuilder, реализуйте описанную задачу
 * этими двумя способами, замеряя время работы программы.
 */

package day8;

public class Task1 {
    public static void main(String[] args) {
        //реализация через String
        String myString = "0";
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 20000; i++) {
            myString = myString + " " + i;
        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(myString);

        //реализация через StringBuilder
        StringBuilder sb = new StringBuilder("0");
        long start1 = System.currentTimeMillis();
        for (int i = 1; i <= 20000; i++) {
            sb.append(" ").append(i);
        }
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println(sb.toString());

        System.out.println("Время работы цикла используя объект String: " + timeConsumedMillis);
        System.out.println("Время работы цикла используя объект StringBuilder: " + timeConsumedMillis1);



    }
}
