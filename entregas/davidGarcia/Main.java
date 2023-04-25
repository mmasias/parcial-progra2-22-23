public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("red", true);
        c.setRadius(5);
        System.out.println("Area: " + c.area());
        System.out.println("Perimeter: " + c.perimeter());
        Rectangle r = new Rectangle("blue", false);
        r.setLenght(5);
        r.setWhidth(10);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }

}