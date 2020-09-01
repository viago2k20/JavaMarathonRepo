package day9;

public class Circle extends Figure {
    private double radius;

    //constructor
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    //getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        //Площадь круга = PI*radius*radius
        return Math.PI * (radius * radius);
    }

    @Override
    public double perimeter() {
        //Длины окружности = 2*PI*radius
        return Math.PI * 2*radius;
    }
}
