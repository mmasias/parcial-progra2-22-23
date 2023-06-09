package src.main.ex2;

public class Square extends Rectangle{
	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);
	}
	public double getSide() {
		return width;
	}
	public void setSide(double side) {
		this.width = side;
		this.length = side;
	}
	@Override
	public void setLength(double length) {
		this.width = length;
		this.length = length;
	}
	@Override
	public String toString() {
		return "Square [side=" + width + ", color=" + color + ", filled=" + filled + "]";
	}
}
