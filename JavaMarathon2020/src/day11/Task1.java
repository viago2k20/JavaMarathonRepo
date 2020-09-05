package day11;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        picker.doWork(warehouse);
        picker.doWork(warehouse);
        courier.doWork(warehouse);

        System.out.println(picker.toString());
        System.out.println(courier.toString());
        System.out.println(warehouse.toString());

        Picker picker1 = new Picker(warehouse);
        Courier courier1 = new Courier(warehouse);

        picker1.doWork(warehouse);
        picker1.doWork(warehouse);
        courier1.doWork(warehouse);
        courier1.doWork(warehouse);

        System.out.println(picker1.toString());
        System.out.println(courier1.toString());
        System.out.println(warehouse.toString());

        for(int i = 0 ; i < 1505; i++){
            picker1.doWork(warehouse);
            courier1.doWork(warehouse);
        }

        System.out.println(picker1.toString());
        System.out.println(courier1.toString());
        System.out.println(warehouse.toString());




    }
}
