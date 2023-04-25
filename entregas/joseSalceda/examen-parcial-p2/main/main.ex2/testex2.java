public class testex2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue", true);
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println();

        Rectangle r1 = new Rectangle(2.0, 4.0, "red", false);
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println();

        Square s1 = new Square(3.0, "green", true);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
        System.out.println();
    }
}

