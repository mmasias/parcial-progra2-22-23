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

        toString="Dia "+date+"\nMes: "+month+"\nAño: "+year;
        return toString;
    }

    String format(String format){
        return null;
    }
}
