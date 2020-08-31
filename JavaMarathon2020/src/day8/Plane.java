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

package day8;

public class Plane {
    private String aircraftManufacturer;
    private int year;
    private double planeLength;//длина самолета
    private double planeWeight;//вес самолета
    private double volumeFuel;//объем топлива в баке

    public Plane(String aircraftManufacturer, int year, double planeLength, double planeWeight) {

        this.aircraftManufacturer = aircraftManufacturer;
        this.year = year;
        this.planeLength = planeLength;
        this.planeWeight = planeWeight;
        this.volumeFuel = 0;
    }
    //переопределение метода toString!
    public String toString(){
        info();
        return "";
    }

    //block of setters and getters
    public void setAircraftManufacturer(String aircraftManufacturer) {
        this.aircraftManufacturer = aircraftManufacturer;
    }

    public String getAircraftManufacturer() {
        return aircraftManufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPlaneLength(double planeLength) {
        this.planeLength = planeLength;
    }

    public double getPlaneLength() {
        return planeLength;
    }

    public void setPlaneWeight(double planeWeight) {
        this.planeWeight = planeWeight;
    }

    public double getPlaneWeight() {
        return planeWeight;
    }

    public void setVolumeFuel(double volumeFuel) {
        this.volumeFuel = volumeFuel;
    }

    public double getVolumeFuel() {
        return volumeFuel;
    }
    //end block of setters and getters

    //заправка бака самолета
    public void fillUp(double fuel){
        volumeFuel += fuel;
    }

    //метод выдает информацию о самолете и объеме топлива
    public void info(){
        System.out.println("Изготовитель: " + getAircraftManufacturer());
        System.out.println("Год выпуска: " + getYear());
        System.out.println("Длина: " + getPlaneLength());
        System.out.println("Вес: " + getPlaneWeight());
        System.out.println("Объем топлива в баке: " + getVolumeFuel());
        System.out.println("");
    }


}
