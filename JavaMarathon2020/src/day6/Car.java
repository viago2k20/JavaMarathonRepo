/**
 * 1. Создать класс Автомобиль, с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать геттеры и сеттеры для каждого поля. Создать экземпляр класса Автомобиль,
 * задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */

package day6;

public class Car {
    private int yearOfManufacture;
    private String color;
    private String model;

    //setter and getter for yearOfManufacture
    //ключевое слово this не использовал
    public void setYearOfManufacture(int year) {
        yearOfManufacture = year;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    //setter and getter for color
    public void setColor(String carColor) {
        color = carColor;
    }

    public String getColor() {
        return color;
    }

    //setter and getter for model
    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    public void getAbout() {
        System.out.println("Это автомобиль!");
    }

    public void carAge(int anyYear) {
        if (anyYear < getYearOfManufacture())
            System.out.println("Вы ввели цифры года ранее чем выпущен автомобиль!");
        if (anyYear == getYearOfManufacture())
            System.out.println("Это год выпуска!");
        else
            System.out.println("Возраст автомобиля: " + (anyYear - getYearOfManufacture()));


    }

}
