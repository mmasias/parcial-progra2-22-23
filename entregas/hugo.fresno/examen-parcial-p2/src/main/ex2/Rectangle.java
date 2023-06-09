package main.ex2;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle(double width, double length) {
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
    double getArea(){

        double area=(width*length)/2;
        return area;
    }

    double getPerimeter() {

        double perimeter=length+width*2;

        return perimeter;
    }

}
