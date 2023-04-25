package main.ex2;

public class Rectangle extends Shape{

    private double width;
    private double length;
    private double area;
    private double perimeter;

    public Rectangle(double width,double lenght) {
        this.width = width;
        this.length = lenght;
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

    public Double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public int area(){
        area=length*width;
        System.out.println("The area is " + area);
        return 0;
    }
    public void perimetro() {
        perimeter = ((2*length)+(2*width));
        System.out.println("the perimeter is " + perimeter);

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}

