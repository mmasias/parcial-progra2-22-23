package main.ex2;

public class Square extends Rectangle{

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    @Override
    double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    double getArea() {
        return super.getArea();
    }
}
