package main.ex2;

public class Rectangle extends Shape{

    protected double width;
    protected double length;

    public Rectangle(String verde, boolean b, double width, double length) {
        super();
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
    double getPerimeter() {
        return 0;
    }

}
