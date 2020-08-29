package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfManufacture(1985);
        car1.setColor("Red");
        car1.setModel("Ferrari 328");

        car1.getAbout();
        car1.carAge(2020);

        Motorbike motorbike1 = new Motorbike(1956, "black", "Batcycle");
        motorbike1.getAbout();
        motorbike1.motobikeAge(1959);


    }
}
