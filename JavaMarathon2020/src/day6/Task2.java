/**
 * Создать класс Самолет с полями “изготовитель”, “год выпуска”, “длина”, “вес”, “объем топлива в баке”.
 * Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей
 * класса (значение поля “объем топлива в баке” установить равным 0). В конструкторе для передачи
 * полям значений использовать ключевое слово this. Помимо этого, в классе необходимо реализовать
 * метод info(), который выводит сообщение в следующем формате:
 * “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., объем топлива в баке: …”
 * Также, необходимо реализовать метод fillUp(), который в качестве аргумента принимает число и заправляет
 * топливный бак самолета на это значение.
 * Создать новый объект класса Самолет с произвольными данными.
 * Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp() два раза, передав разные
 * значения. Вызвать метод info().
 */

package day6;

public class Task2 {
    public static void main(String[] args) {
        Plane plane1 = new Plane("TU144", 1968, 59.4, 150000.0);
        plane1.info();

        plane1.setYear(1983);
        plane1.setPlaneLength(60.0);
        plane1.fillUp(92000);//полный бак
        plane1.fillUp(32000);//после первого полета

        plane1.info();

    }
}
