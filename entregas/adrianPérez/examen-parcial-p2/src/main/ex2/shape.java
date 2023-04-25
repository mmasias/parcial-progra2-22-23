package main.ex2;

public abstract class shape {
    protected abstract double getPerimeter();
    protected abstract double getArea();

    protected String color;
    protected boolean filled;

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    boolean getFilled() {
        return filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    String toString(String color, boolean filled) {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
