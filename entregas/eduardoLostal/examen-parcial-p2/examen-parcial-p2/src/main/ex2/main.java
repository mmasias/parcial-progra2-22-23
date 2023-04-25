package main.ex2;

public class main {

    public static void main(String[] args) {

        Rectangle rectangle =new Rectangle("white",true,5, 5.5 );
        Circle circle = new Circle("black", true, 6);
        Square square = new Square("orange", true, 8, 8);

        System.out.println(rectangle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(square.getSide());
        System.out.println(rectangle.toString());

    }
}
