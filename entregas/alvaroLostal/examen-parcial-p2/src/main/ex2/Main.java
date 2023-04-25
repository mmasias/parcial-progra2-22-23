package main.ex2;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setColor("red");
        c.setFilled(true);
        c.setRadius(5);
        System.out.println(c.toString());

        Square s = new Square();
        s.setColor("blue");
        s.setFilled(false);
        s.setSide(10);
        System.out.println(s.toString());

        Rectangle r = new Rectangle();
        r.setColor("green");
        r.setFilled(true);
        r.setLength(10);
        r.setWidth(5);
        System.out.println(r.toString());
    }
}
