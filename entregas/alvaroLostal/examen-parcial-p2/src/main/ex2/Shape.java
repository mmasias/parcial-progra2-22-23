package main.ex2;

public class Shape {
    protected String color;
    protected boolean filled;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea() {
        return 0;
    }
    double getPerimeter() {
        return 0;
    }
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
