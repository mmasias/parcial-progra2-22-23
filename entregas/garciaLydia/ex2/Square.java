package main.ex2;

public class Square extends Rectangle{
   double side;

    public Square(double width, double lenght, double side) {
        super(width, lenght);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
