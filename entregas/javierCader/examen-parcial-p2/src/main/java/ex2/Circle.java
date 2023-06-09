package ex2;

public class Circle extends Shape{
    protected double radius;

    public Circle(double radius, boolean filled, String color) {
        super(filled, color);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[Shape[color=%s, filled=%s], radius=%s]", this.color, this.filled, this.radius);
    }
}
