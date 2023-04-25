package ex2;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Shape[color=%s, filled=%s]", this.color, this.filled);
    }
}
