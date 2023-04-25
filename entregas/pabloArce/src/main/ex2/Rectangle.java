package main.ex2;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }
    public void setWidth(double width) {
        this.width = width;
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
        return "Rectangle [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
    }
}
