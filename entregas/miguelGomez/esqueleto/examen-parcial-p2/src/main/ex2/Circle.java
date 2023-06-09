public class Circle extends Shape{
    protected double Radius;

    public double getRadius(){
        return Radius;
    }
    public void setRadius(double){
        this.Radius = Radius;
    }
    public double getArea(){
        return 3.14*(Radius)*(Radius);
    }
    public double getPerimeter(){
        return 2*3.14*Radius;
    }

    public String toString(){
        System.out.println("Circle [ Shape [ color " + "");
    }
}
