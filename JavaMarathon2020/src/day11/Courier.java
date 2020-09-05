package day11;

public class Courier implements Worker {

    private double salary;
    private int i;//счетчик выполненых дел рабочего
    private final Warehouse warehouse = new Warehouse();


    public Courier(Warehouse warehouse) {
        this.i = 0;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nЗП курьера " + salary
                + "\nКоличество выполненых дел: " + i;
    }

    @Override
    public void doWork(Warehouse warehouse) {
        System.out.println("ЗП Курьеру");
        salary += 100;
        i++;
        warehouse.setBalance(1000);
        if (warehouse.getBalance() == 1000000) {
            System.out.println("Бонус Курьеру! >>>>>>");
            salary += bonus();
        }

    }

    @Override
    public int bonus() {
        return 100 * 2;//Бонус Курьеру в виде двойной оплаты
    }
}
