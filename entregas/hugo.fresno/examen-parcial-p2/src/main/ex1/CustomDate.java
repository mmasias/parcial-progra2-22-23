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
        if (date<10&&month<10){
            String newdate="0"+date;
            String newmonth="0"+month;
            toString=newdate+"/"+newmonth+"/"+year;
        }else if (date<10&&month>9){
            String newdate="0"+date;
            toString=newdate+"/"+month+"/"+year;
        } else if (date>9&&month<10) {
            String newmonth="0"+month;
            toString=date+"/"+newmonth+"/"+year;
        }else {
            toString=date+"/"+month +"/"+year;

        }

        return toString;
    }

    public String format(String separador){
        String format;

        if (date<10&&month<10){
            String newdate="0"+date;
            String newmonth="0"+month;
            format=newdate+separador+newmonth+separador+year;
        }else if (date<10&&month>9){
            String newdate="0"+date;
            format=newdate+separador+month+separador+year;
        } else if (date>9&&month<10) {
            String newmonth="0"+month;
            format=date+separador+newmonth+separador+year;
        }else {
            format=date+separador+month +separador+year;

        }
        //char[]newFormat = format.toCharArray();




        /*String cero= String.valueOf(newFormat[0]);
        String uno=String.valueOf(newFormat[1]);
        String dos=String.valueOf(newFormat[3]);
        String tres=String.valueOf(newFormat[4]);
        String cuatro=String.valueOf(newFormat[6]);
        String cinco=String.valueOf(newFormat[7]);
        String seis=String.valueOf(newFormat[8]);
        String siete=String.valueOf(newFormat[9]);*/

        //String finalFormat=cero+uno+separador+dos+tres+separador+cuatro+cinco+seis+siete;




        return format;
    }
}
