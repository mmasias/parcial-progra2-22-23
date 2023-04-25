public class Rectangle extends Shape{
    private double width;
    private double lenght;

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void getArea(){
        double a;
        a=width*lenght;
    }
    public void getPerimeter(){
        double p;
        p= (2*width)+(2*lenght);
    }
}
