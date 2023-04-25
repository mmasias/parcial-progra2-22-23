package main.ex2;

public class Square extends Rectangle{
    public Square(){
        super();
    }
    public double getSide(){
        return this.width;
    }
    public void setSide(double side){
        this.width = side;
        this.length = side;
    }
    // public void setLenght is not necessary as setSide covers it
    public String toString(){
        return "Square [ Rectangle [ Shape [ color =" + this.color + ", filled=" + this.filled + "], width=" + this.width + ", length=" + this.length + "]]";
    }
}
