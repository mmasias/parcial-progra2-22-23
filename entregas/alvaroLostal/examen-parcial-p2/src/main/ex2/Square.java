package main.ex2;

public class Square extends Rectangle {
    public double getSide() {
        return width;
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }
    public void setLength(double side) {
        this.length = side;
    }
    public String toString() {
        return "Square[Rectangle[Shape[color=" + color + ",filled=" + filled + "],width=" + width + ",length=" + length + "]]";
    }
}
