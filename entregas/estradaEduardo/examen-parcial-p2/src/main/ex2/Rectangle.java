package main.ex2;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }

    public String toString(){
        return "Rectangle [ Shape [ color = " + color + ", filled = " + filled + " ], width = " + width + ", length = " + length + " ]";
    }
}