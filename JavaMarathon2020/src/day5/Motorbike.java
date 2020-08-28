/**
 * Создать класс Мотоцикл, с  полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не использовать).
 * Придерживаться принципов инкапсуляции и использовать ключевое слово this.
 */

package day5;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;

    }

    public void setYearOfManufacture(int year) {
        this.year = year;
    }

    public int getYearOfManufacture() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void getInfo() {
        System.out.println("Информация об объекте:");
        System.out.println("Год выпуска:"+ year + " Цвет:" + color + " Модель:" + model);
    }
}
