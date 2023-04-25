package main;

public class Circle extends Shape {

    private double radio;

    public Circle(String color, boolean filled, double radio) {
        super(color, filled);
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void getPerimeter(){

getPerimeter(2*Math.PI,radio);

    }
    public void getArea(){

    getArea(Math.PI,radio*radio);

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                '}';
    }
}
