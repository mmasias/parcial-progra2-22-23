package main.ex2;

public class square extends rectangle{
    public double getSide(){
        return width;
    }
    
    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    public void setLength(double side){
        this.length = side;
    }

    @Override
    public String toString(){
        return "Square[Rectangle[Shape [color=" + color + ", filled=" + filled + "], width=" + width + ", length=" + length + "]]";
    }
}
