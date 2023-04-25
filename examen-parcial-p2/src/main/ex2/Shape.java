package main.ex2;

public class Shape {

    String color;
    boolean filled;
    private double area;
    private double perimeter;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    boolean isFilled(){

        return this.isFilled();
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
