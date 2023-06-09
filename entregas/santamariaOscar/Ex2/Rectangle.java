public class Rectangle extends  Shape{
   private double width;
   private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(double width, double length){
        return this.getWidth()* this.getLength();
    }
    public double getPerimeter(double width, double length){
        return (2*this.getWidth())+(2*this.getLength());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
