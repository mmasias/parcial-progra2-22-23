package ex2;

public abstract class Shape {
    protected String Color;
    protected boolean filled;

    public String getColor(){
        return Color;
    };

    public void setColor(String Color) {
        this.Color = Color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    abstract double getArea();

    abstract double getPerimeter();

    public void printString(){
        System.out.println("Shaped [color =" + getColor() + ", filled =" + isFilled() +"]");

    }

}
