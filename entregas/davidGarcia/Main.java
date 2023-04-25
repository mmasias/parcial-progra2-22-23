package Core;

import Core.Circle;
import Core.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("red", true);
        System.out.println("Circle");
        c.setRadius(5);
        System.out.println("Circle "+ (" [ Shape "+ ("[ colour = "+ c.getColour() + ", filled = ] " + c.isFilled()) + ", radius " + c.getRadius()));
        Rectangle r = new Rectangle("blue", false);
        System.out.println("Rectangle");
        r.setLenght(5);
        r.setWhidth(10);
        System.out.println("Rectangle "+ (" [ Shape "+ ("[ colour = "+ r.getColour() + ", filled = ] " + r.isFilled()) + ", lenght " + r.getLenght() + ", whidth " + r.getWhidth()));

    }

}