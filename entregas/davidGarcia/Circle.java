package Core;

public class Circle extends Shape {
    private double radius;
    public Circle(String colour, boolean filled) {
        super(colour, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public String toString (String colour, boolean filled, double radius){
        return "Colour: "+colour+"\nFilled: "+filled+"\nRadius: "+radius;
    }


}
