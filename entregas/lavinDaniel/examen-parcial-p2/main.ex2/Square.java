public class Square extends Rectangle{
    public Square(String color, boolean filled, double width, double lenght) {
        super(color, filled, width, lenght);
    }

    public double getSide(){
        double l=super.getLenght();
        return l;
   }
   public void setSide(){

   }
    public void setLenght(){

    }

    @Override
    public String toString() {
        return "Square{}";
    }
}
