package entregas.diegoBarraza.src.main.ex2;

public class Shape {
    protected String  color;

    protected boolean filled;

public Shape(String color,boolean filled){
    this.color=color;
    this.filled=filled;
}

    public void setColor(String color){
     this.color=color;
    }

    public String getColor(){
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getarea(){
    return 0;
    }

    public double getperimeter(){
    return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
