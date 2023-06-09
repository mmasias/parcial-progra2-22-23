package main.ex2;

public class Circle extends Shape {
    private double radious;
    private double area;
    private double perimeter;

    public Circle(double radious) {
        super();
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    @Override
    public Double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public Double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    public double area(){
        area=Math.PI * Math.pow(getRadious(),2);
        System.out.println("the area is " + area);
        return 0;
    }
    public double perimeter() {
        perimeter = 2*Math.PI*getRadious();
        System.out.println("the perimeter is  " + perimeter);
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radious=" + radious +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }



}
