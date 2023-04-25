package Main.ex2;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        double area = (double) (length*width);
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2*width + 2*length;
        return perimeter;
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
