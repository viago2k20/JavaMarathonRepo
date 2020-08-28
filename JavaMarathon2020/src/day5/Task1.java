/**
 * 1. Создать класс Автомобиль, с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать геттеры и сеттеры для каждого поля. Создать экземпляр класса Автомобиль,
 * задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */
package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfManufacture(1985);
        car1.setColor("Red");
        car1.setModel("Ferrari 328");
        System.out.println("Год выпуска: " + car1.getYearOfManufacture());
        System.out.println("Цвет автомобиля " + car1.getColor());
        System.out.println("Модель автомобиля " + car1.getModel());


    }
}
