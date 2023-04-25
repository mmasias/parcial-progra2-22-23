package main;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

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

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }public double getPerimeter(double l1, double l2){

        double p = 0;

        p =( l1 + l2) *2;
        return p;
    }
    public double getArea(double l1,double l2){



        double area = 0;
        area = l1*l2;
        return area;
    }

}
