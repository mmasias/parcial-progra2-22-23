package main.ex2;

public abstract class shape {
    public abstract double getPerimeter();
    public abstract double getArea();

    protected String color;
    protected boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(String color, boolean filled) {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
