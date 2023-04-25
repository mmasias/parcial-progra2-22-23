package main;

public class Square extends Rectangle{
    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }
    public void setSide(){

        setWidth(width);
    }
    public void setLength(){
setLength(length);
    }
}
