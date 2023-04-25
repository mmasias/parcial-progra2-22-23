import main.Circle;
import main.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle c1= new Circle("red",true,2.1);
        Rectangle r1= new Rectangle("blue",true,2,2);
        c1.getPerimeter();
    }
}