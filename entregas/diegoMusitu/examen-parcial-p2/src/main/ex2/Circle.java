package main.ex2;

public class Circle extends Shape {
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    protected double radius;
    @Override
    double getArea() {
        return 3.1416*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*3.1416*radius;
    }
    @Override
    public String toString(){
        return null;
    }
}
