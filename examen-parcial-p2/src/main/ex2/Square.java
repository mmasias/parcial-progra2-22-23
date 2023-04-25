package main.ex2;

public class Square extends Rectangle{

    private double Side;
    double length;

    public double getSide() {
        return Side;
    }

    public void setSide(double side) {
        Side = side;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        return "Square{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", Side=" + Side +
                ", length=" + length +
                '}';
    }
}
