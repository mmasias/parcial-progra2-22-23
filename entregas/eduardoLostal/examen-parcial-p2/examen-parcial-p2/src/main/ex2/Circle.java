package main.ex2;

public class Circle extends Shape{

    protected double radius;


    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString(String color, boolean filled) {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled + '\'' +
                ", radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        double solucion;
        solucion = 3.14 * (Math.pow(radius, 2));
        return solucion;

    }

    @Override
    public double getPerimeter() {
        double solution;
        solution = 3.14 * (2*radius);
        return solution;
    }
}
