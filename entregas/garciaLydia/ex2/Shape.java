package main.ex2;

public abstract class Shape {
    String color;
    Boolean filled;
    Double area;
    Double perimeter;

    public Shape() {
        this.color = color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Double getArea() {
        return area;
    }



    public Double getPerimeter() {
        return perimeter;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
