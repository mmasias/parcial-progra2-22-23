
public class Square extends Rectangle{
    public Square(double width, double length) {
        super(width, length);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double width){
        System.out.println("The side of the square is: " + getWidth());
    }

    public void setLength(double length){
        System.out.println("The length od the square is: " +getLength());
    }

    @Override
    public String toString() {
        return "Square{}";
    }
}
