/**
 * у преподавателя
 * * есть метод "оценить студента" принимающий в параметры студента, и работающий следующим
 * * образом: генерируется случайное число от 2 до 5, выводится
 * * строка: "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил
 * * студента с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
 * * Все слова, написанные большими буквами, должны быть заменены соответствующими значениями. ОЦЕНКА должна
 * * принимать значения "отлично”, "хорошо”, "удовлетворительно" или "неудовлетворительно", в зависимости
 * * от значения случайного числа.
 */

package day6;

import java.util.Random;

public class Teacher {
    private String fio;
    private String subject;

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public void rateAStudent(String fioStudent) {
        int score = (int) (Math.random() * ((5 - 2) + 1)) + 2;
        System.out.print("Преподаватель " + fio + " оценил студента " + fioStudent + " по предмету " + subject + " на оценку: ");
        switch (score) {
            case 2:
                System.out.print(" Неудовлетворительно");
                break;
            case 3:
                System.out.print(" Удовлетворительно");
                break;
            case 4:
                System.out.print(" Хорошо");
                break;
            case 5:
                System.out.print(" Отлично");
                break;
        }
        System.out.println("");
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomFrom2to5 = random.nextInt(4) + 2;
        String score = "";
        switch (randomFrom2to5) {
            case 2:
                score = "Неудовлетворительно";
                break;
            case 3:
                score = "Удовлетворительно";
                break;
            case 4:
                score =" Хорошо";
                break;
            case 5:
                score =" Отлично";
                break;
        }
        System.out.println("Преподаватель " + this.fio + " оценил студента " + student.getFio()
                + " по предмету " + this.subject + " на оценку: " + score);
    }
}
