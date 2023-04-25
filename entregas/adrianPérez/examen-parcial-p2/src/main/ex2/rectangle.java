package main.ex2;

public class rectangle extends shape{
    protected double width;
    protected double length;

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

    public double getArea() {
        return width * length;
    }
    
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[Shape [color=" + color + ", filled=" + filled + "], width=" + width + ", length=" + length + "]";
    }
}
