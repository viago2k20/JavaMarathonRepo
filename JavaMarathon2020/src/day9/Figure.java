package day9;

public abstract class Figure {
    private String color;

    //constructor
    public String getColor() {
        return color;
    }

    //getter and setter
    public void setColor(String color) {
        this.color = color;
    }

    public Figure(String color) {
        this.color = color;
    }

    public abstract double area();//возвращает площадь фигуры
    public abstract double perimeter();//возвращает периметр фигуры
}
