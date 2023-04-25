package entregas.saraPatino.src.main;

abstract class Shape {
    String color;
    boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract String getColor();

    public abstract void setColor(String c);

    public abstract boolean isFilled();

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}
