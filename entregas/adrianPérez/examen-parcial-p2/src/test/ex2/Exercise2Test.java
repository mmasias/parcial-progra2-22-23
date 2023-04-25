package test.ex2;

import main.ex2.rectangle;

public class Exercise2Test {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.setColor("red");
        r.setFilled(true);
        r.setWidth(5);
        r.setLength(10);
        System.out.println(r.toString());

        square s = new square();
        s.setColor("blue");
        s.setFilled(false);
        s.setSide(5);
        System.out.println(s.toString());

        circle c = new circle();
        c.setColor("green");
        c.setFilled(true);
        c.setRadius(5);
        System.out.println(c.toString());
    } 
}
