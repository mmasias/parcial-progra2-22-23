package ex2;

public class Square extends Rectangle {

    public Square(double side, boolean filled, String color) {
        super(side, side, filled, color);
    }
    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return String.format("Square[Rectangle[Shape[color=%s, filled=%s], width=%s, length=%s]]", this.color, this.filled, this.width, this.length);
    }
}
