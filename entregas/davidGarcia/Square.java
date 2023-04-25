package Core;

import Core.Rectangle;

public class Square extends Rectangle {
    public Square(String colour, boolean filled) {
        super(colour, filled);
    }
    public double getSide(){
        return getLenght();
    }
    public void setSide(double side){
        setLenght(side);
        setWhidth(side);
    }
    public void setLenght(double lenght){
        setSide(lenght);
    }
    public void toString (String colour, boolean filled, double side){
        System.out.println("Colour: "+colour +"\nFilled: "+filled+"\nSide: "+side);

    }

}
