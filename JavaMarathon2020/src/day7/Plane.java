/**
 *
 */

package day7;

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
    public void fillUp(double fuel) {
        volumeFuel += fuel;
    }

    //метод сравнивает длины самолетов
    public static void difference(Plane plane1, Plane plane2) {

        if (plane1.getPlaneLength() > plane2.getPlaneLength()) {
            System.out.println("Самолет " + plane1.getAircraftManufacturer() + " длиннее самолета " + plane2.getAircraftManufacturer());
        }
        if (plane1.getPlaneLength() < plane2.getPlaneLength()) {
            System.out.println("Самолет " + plane2.getAircraftManufacturer() + " длиннее самолета " + plane1.getAircraftManufacturer());
        }
        if (plane2.getPlaneLength() == plane1.getPlaneLength()) {
            System.out.println("Самолет " + plane1.getAircraftManufacturer() + " такой же длинны как и самолет " + plane2.getAircraftManufacturer());
        }
    }

    //метод выдает информацию о самолете и объеме топлива
    public void info() {
        System.out.println("Изготовитель: " + getAircraftManufacturer());
        System.out.println("Год выпуска: " + getYear());
        System.out.println("Длина: " + getPlaneLength());
        System.out.println("Вес: " + getPlaneWeight());
        System.out.println("Объем топлива в баке: " + getVolumeFuel());
        System.out.println("");

    }


}
