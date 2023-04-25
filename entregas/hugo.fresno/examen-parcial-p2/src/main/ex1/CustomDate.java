package main.ex1;

public class CustomDate {

    int date;
    int month;
    int year;

    public CustomDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String toString(){

        String toString;

        toString=date+"/"+month+"/"+year;
        return toString;
    }

    String format(String format){
        char[]newFormat = format.toCharArray();
        String separador="-";


        String cero= String.valueOf(newFormat[0]);
        String uno=String.valueOf(newFormat[1]);
        String dos=String.valueOf(newFormat[3]);
        String tres=String.valueOf(newFormat[4]);
        String cuatro=String.valueOf(newFormat[6]);
        String cinco=String.valueOf(newFormat[7]);
        String seis=String.valueOf(newFormat[8]);
        String siete=String.valueOf(newFormat[9]);

        String finalFormat=cero+uno+separador+dos+tres+separador+cuatro+cinco+seis+siete;




        return finalFormat;
    }
}
