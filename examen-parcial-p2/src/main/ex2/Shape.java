package main.ex2;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    String getcolor(){};
    public void setColor(){};
    boolean isFilled(){};
    protected void setFilled(boolean b){};

    abstract double getArea();
    abstract double getPerimeter();

    @Override

}
