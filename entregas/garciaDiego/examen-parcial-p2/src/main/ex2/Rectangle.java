package main.ex2;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
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

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

    public String toString(){
        return "Rectangle [ Shape [ color = " + color + ", filled = " + filled + " ],width = " + width + ", length = " + length + " ]";
    }
}
