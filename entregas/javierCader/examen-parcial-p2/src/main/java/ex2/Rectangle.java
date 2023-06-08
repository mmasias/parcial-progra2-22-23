package ex2;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(double width, double length, boolean filled, String color) {
        super(filled, color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return String.format("Rectangle[Shape[color=%s, filled=%s], width=%s, length=%s]", this.color, this.filled, this.width, this.length);
    }
}
