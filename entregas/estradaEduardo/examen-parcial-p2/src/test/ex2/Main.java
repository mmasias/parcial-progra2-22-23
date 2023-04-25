package test.ex2;
import main.ex2.*;

public class Main {
    public static void main(String[] args) {
        testCircle();
        testRectangle();
        testSquare();
    }

    private static void testCircle(){
        System.out.println("Testing Circle class...");
        Circle circle = new Circle("red", true);
        circle.setRadius(5);
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }

    private static void testRectangle(){
        System.out.println("Testing Rectangle class...");
        Rectangle rectangle = new Rectangle("blue", false);
        rectangle.setLength(5);
        rectangle.setWidth(10);
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }

    private static void testSquare(){
        System.out.println("Testing Square class...");
        Square square = new Square("green", true);
        square.setSide(5);
        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}