package main.ex2;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public String getcolor(){
        return null;
    };
    public void setColor(){};
    boolean isFilled(){
        return false;
    };
    protected void setFilled(boolean b){};

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString(){
        return null;
    }
}
