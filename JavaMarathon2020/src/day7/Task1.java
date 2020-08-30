package day7;
/**
 *Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
 *В классе Самолет создать статический метод, который в качестве аргументов принимает
 *два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том, какой
 *из самолетов длиннее.
 **/


public class Task1 {
    public static void main(String[] args) {
        Plane plane1 = new Plane("TUPOLEV", 1998, 55, 35000);
        Plane plane2 = new Plane("SAAB", 2005, 32, 27000);

        Plane.difference(plane1, plane2);

    }
}
