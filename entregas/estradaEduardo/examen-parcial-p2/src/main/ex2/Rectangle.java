class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }

    public double getLenght(){
        return this.length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLenght(double height){
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }

    public String toString(){
        return "Rectangle [ Shape [ color = " + color + ", filled = " + filled + " ], width = " + width + ", length = " + length + " ]";
    }
}