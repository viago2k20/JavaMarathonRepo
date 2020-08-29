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

public class Teacher {
    private String fio;
    private String subject;

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public void rateAStudent(String fioStudent) {
        int score = (int) (Math.random() * ((5 - 2) + 1)) + 2;
        System.out.print("Преподователь " + fio + " оценил студента " + fioStudent + " по предмету " + subject + " на оценку: ");
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
    }
}
