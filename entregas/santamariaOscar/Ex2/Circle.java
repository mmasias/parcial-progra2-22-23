
public class Circle extends  Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        System.out.println("The radius of the circle is: " + getRadius());
    }

    public double getArea(){
        double a= Math.PI*getRadius()*getRadius();
        return a;
    }

    public double getPerimeter(){
        double p= 2*Math.PI*getRadius();
        return p;
    }
}
