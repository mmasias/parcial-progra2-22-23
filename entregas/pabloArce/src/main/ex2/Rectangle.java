package main.ex2;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
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
    public double getArea() {
        return this.width * this.length;
    }
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }
    public String toString() {
        return "Rectangle [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
    }
}
