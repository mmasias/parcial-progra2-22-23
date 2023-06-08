package main.ex2;

public class Circle extends Shape{
    protected double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        Double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double getPerimeter(){
        Double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public String toString(){
        return "Circle [ Shape [ color = " + color + ", filled = " + filled + " ], radius = " + radius + " ]";
    }
}
