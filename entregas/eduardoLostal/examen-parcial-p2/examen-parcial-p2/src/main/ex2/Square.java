package main.ex2;

public class Square extends Rectangle{



    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public double getSide(){

        return width;
    }

    public void setSide(double width){

        this.width = width;

    }

    public void setLength(double length){

        this.length = length;

    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled + '\'' +
                ", width=" + width + '\'' +
                ", length=" + length +
                '}';
    }
}

