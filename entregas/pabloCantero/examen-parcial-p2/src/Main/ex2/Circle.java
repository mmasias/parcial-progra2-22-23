package Main.ex2;

public class Circle extends Shape{
    protected double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area =  Math.PI*2*radius;
        return area;
    }
    public double getPerimeter(){
        double perimeter = Math.PI* (radius*2);
        return perimeter;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
