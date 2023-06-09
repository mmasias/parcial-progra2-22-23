package main.ex2;

public class Rectangle extends Shape{
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    protected double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    protected double length;
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return width*length;
    }

    @Override
    double getPerimeter() {
        return 2*width+2*length;
    }
    @Override
    public String toString(){
        return null;
    };
}
