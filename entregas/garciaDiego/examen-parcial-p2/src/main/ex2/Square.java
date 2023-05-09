package main.ex2;

public class Square extends Rectangle{

    public Square(String color, boolean filled, double width) {
        super(width, width, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString(){
        return "Square [ Rectangle [ Shape [ color = " + color + ", filled = " + filled + " ],width = " + width + ", length = " + width + " ] ]";
    }

}
