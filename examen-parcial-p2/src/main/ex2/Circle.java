package main.ex2;

public class Circle extends Shape{

    private double radius;
    double area;
    double perimeter;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return area;
    }


    public double getPerimeter() {
        return perimeter;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
