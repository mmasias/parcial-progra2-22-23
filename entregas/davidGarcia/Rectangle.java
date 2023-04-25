public class Rectangle extends Shape {
    private double whidth;
    private double lenght;
    public Rectangle(String colour, boolean filled) {
        super(colour, filled);
    }

    public double getWhidth() {
        return whidth;
    }

    public void setWhidth(double whidth) {
        this.whidth = whidth;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double perimeter(){
        return 2*(whidth+lenght);
    }
    public double area(){
        return whidth*lenght;
    }
}

