package main.ex2;

public class Rectangle extends Shape{

    protected double width;
    protected double length;


    public Rectangle(String color, boolean filled, double width, double length ) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double solucion;
        solucion = width * length;
        return solucion;
    }

    @Override
    public double getPerimeter() {
        double solucion;
        solucion = width + length + width + length;
        return  solucion;

    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled + '\'' +
                ", width=" + width + '\'' +
                ", length=" + length +
                '}';

    }
}
