package day9;

public class Task1 {
    public static void main(String[] args) {
        Human human = new Human("Вася");
        human.printInfo();
        Student student = new Student("Петя", "Big Two");
        student.printInfo();
        Teacher teacher = new Teacher("Анатолий Иванович", "Программирование");
        teacher.printInfo();

    }
}
