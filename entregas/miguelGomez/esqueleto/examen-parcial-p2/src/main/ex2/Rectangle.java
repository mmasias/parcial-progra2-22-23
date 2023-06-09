public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double){
        this.width= width;
    }
    public void setLength(double){
    this.length= length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return ((2*width) + (2*length));
    }
    public String toString(){

    }
}
