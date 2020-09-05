package day11;

public class Warehouse {

    private int countOrder = 0;
    private double balance;

    //constructor
    public Warehouse() {
    }

    //getters and setters
    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder += countOrder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    //переопределяем toString
    public String toString() {
        return "\nКоличество собранных заказов на складе: " + getCountOrder()
                + "\nДоход от доставленных заказов: " + getBalance();
    }


}
