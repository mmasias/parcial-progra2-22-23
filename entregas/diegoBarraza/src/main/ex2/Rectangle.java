package entregas.diegoBarraza.src.main.ex2;

public class Rectangle extends Shape{
private double width;
private double length;
    public Rectangle(String color, boolean filled,double width,double length) {
        super(color, filled); this.width=width; this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width=width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getarea(){
        return 0;
    }

    public double getperimeter(){
        return 0;
    }
    @Override
    public String toString() {
        return "Rectangle[" +"Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +']' +"["+ width+ length 
                '}';
    }
}
