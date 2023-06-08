package src.main.ex2;

public abstract class Rectangle extends Shape{
	protected double width;
	protected double length;

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;

	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLenght() {
		return length;
	}
	public void setLenght(double lenght) {
		this.length = lenght;
	}
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return 2*(width+length);
	}

	public abstract void setLength(double length);

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
	}
}
