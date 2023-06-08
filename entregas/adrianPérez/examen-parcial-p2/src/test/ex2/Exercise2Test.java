package test.ex2;

import main.ex2.circle;
import main.ex2.rectangle;
import main.ex2.square;

public class Exercise2Test {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.setColor("red");
        r.setFilled(true);
        r.setWidth(5);
        r.setLength(10);
        System.out.println(r.toString());
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

        square s = new square();
        s.setColor("blue");
        s.setFilled(false);
        s.setSide(5);
        System.out.println(s.toString());
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPerimeter());

        circle c = new circle();
        c.setColor("green");
        c.setFilled(true);
        c.setRadius(5);
        System.out.println(c.toString());
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
    }
}
