package main.ex2;

public class Circle extends Shape{
    protected double radius;
    public Circle(){
        super();
        this.radius = 1.0;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    @Override
    public String toString(){
        return "Circle [Shape [color=" + this.color + ", filled=" + this.filled + "], radius=" + this.radius + "]";
    }
}
