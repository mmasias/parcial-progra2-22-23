package entregas.diegoBarraza.src.main.ex2;

public class Circle extends Shape{

    private double radius;
    public Circle(String color, boolean filled,double radius) {
        super(color, filled);this.radius=radius;

    }

    public double getradius(){
        return radius;
    }
    public void setradius(double radius){
        this.radius=radius;
    }
    public double getarea(){
        return 0;
    }

    public double getperimeter(){
        return 0;
    }
    @Override
    public String toString() {
        return "Circle{" +"Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +'\'' + ", radius="+ radius +
                '}';
    }
}
