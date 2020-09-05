package day11;

public class Picker implements Worker {
    private double salary;
    private int i;//счетчик выполненых дел рабочего
    private final Warehouse warehouse = new Warehouse();

    public Picker(Warehouse warehouse) {
        this.i = 0;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "\nЗП сборщика " + salary
                + "\nКоличество выполненых дел: " + i;
    }

    @Override
    public void doWork(Warehouse warehouse) {
        System.out.println("ЗП Сборщику");
        salary += 80;
        i++;
        warehouse.setCountOrder(1);
        if (warehouse.getCountOrder() == 1500) {
            System.out.println("Бонус Сборщику! >>>>>>");
            salary += bonus();
        }
    }

    @Override
    public int bonus() {
        return 80 * 3;//Бонус Сборщику в виде тройной ЗП
    }
}
