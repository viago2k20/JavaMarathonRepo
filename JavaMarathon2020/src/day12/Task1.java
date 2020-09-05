package day12;
/*
Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
 Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка.
  Распечатать список.
 */

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Citroen");
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("KIA");
        cars.add("Ford");
        cars.add(2, "Suzuki");
        cars.remove(0);
        for (String carList : cars) {
            System.out.println(carList);
        }
    }

}
