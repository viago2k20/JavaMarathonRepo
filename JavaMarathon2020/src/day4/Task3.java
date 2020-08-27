/**
 * Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
 * Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна.
 * Если таких строк несколько, вывести индекс последней из них.
 * Пример сгенерированной матрицы (для простоты m=3, n=5):
 *
 * 3 2 1 5 7 	// сумма - 18
 * 1 2 5 6 2 	// сумма - 16
 * 3 4 9 6 4	// сумма - 26
 *
 * Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
 */

package day4;

public class Task3 {
    public static void main(String[] args) {
        int max = 0;
        int m = 12;//количество строк массива
        int n = 8;//количество столбцов массива
        int index = 0;

        int[][] myArray = new int[m][n];
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                myArray[i][j] = (int) Math.round(50 * Math.random());
                sum = sum + myArray[i][j];
                System.out.print(myArray[i][j] + "\t");
            }
            if (sum >= max) {
                max = sum;
                index = i+1;
            }
            System.out.print("\t\tСумма чисел строки: " + sum);
            System.out.println(" ");

        }
        System.out.println(" ");
        System.out.println("Индекс строки, сумма чисел в которой максимальна -> " + index);
    }
}
