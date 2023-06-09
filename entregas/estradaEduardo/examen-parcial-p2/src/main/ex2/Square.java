package main.ex2;

public class Square extends Rectangle {

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public String toString() {
        return "Square [ Rectangle [ Shape [ color = " + color + ", filled = " + filled + " ], width = " + super.getWidth() + ", length = " + super.getLength() + " ] ]";
    }
}