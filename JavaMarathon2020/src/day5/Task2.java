/**
 * Создать класс Мотоцикл, с  полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не использовать).
 * Придерживаться принципов инкапсуляции и использовать ключевое слово this.
 */

package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike(1956, "Black", "Batcycle");
        motorbike1.getInfo();
    }
}
