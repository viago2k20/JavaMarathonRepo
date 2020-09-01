package day9;

public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "Red");
        System.out.println("Площадь круга " + circle.area());
        System.out.println("Периметр окружности " + circle.perimeter());

        Rectangle rectangle = new Rectangle(5, 8, "Red");
        System.out.println("Площадь прямоугольник " + rectangle.area());
        System.out.println("Периметр прямоугольника " + rectangle.perimeter());

        Triangle triangle = new Triangle(10, 10, 10, "Red");
        System.out.println("Площадь триугольника " + triangle.area());
        System.out.println("Периметр триугольника " + triangle.perimeter());




    }
}
