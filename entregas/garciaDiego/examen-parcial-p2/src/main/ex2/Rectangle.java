package main.ex2;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(double width, double length, String color, boolean filled) {
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
        Double area = width * length;
        return area;
    }

    public double getPerimeter(){
        Double perimeter = 2 * (width + length);
        return perimeter;
    }

    public String toString(){
        return "Rectangle [ Shape [ color = " + color + ", filled = " + filled + " ],width = " + width + ", length = " + length + " ]";
    }
}
