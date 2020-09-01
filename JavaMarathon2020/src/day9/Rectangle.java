package day9;

public class Rectangle extends Figure {
    private int width;
    private int high;

    //constructor
    public Rectangle(int width, int high, String color) {
        super(color);
        this.width = width;
        this.high = high;
    }

    //getters and setters
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }


    @Override
    public double area() {
        //Площадь прямоугольника
        return width * high;
    }

    @Override
    public double perimeter() {
        //Периметр прямоугольника
        return 2 * (width + high);
    }
}
