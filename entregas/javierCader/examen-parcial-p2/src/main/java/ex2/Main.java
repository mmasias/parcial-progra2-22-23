package ex2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4, true, "red");
        circle.getArea();
        circle.getPerimeter();
        circle.setRadius(5);
        circle.getRadius();
        circle.isFilled();
        circle.toString();

        Rectangle rectangle = new Rectangle(4, 5, true, "blue");
        rectangle.getArea();
        rectangle.getPerimeter();
        rectangle.setLength(6);
        rectangle.getLength();
        rectangle.setWidth(7);
        rectangle.getWidth();
        rectangle.isFilled();
        rectangle.toString();

        Square square = new Square(4, true, "green");
        square.getArea();
        square.getPerimeter();
        square.setSide(8);
        square.getSide();
        square.isFilled();
        square.toString();
    }
}
