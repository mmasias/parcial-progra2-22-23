package main.ex1;

public class CustomDate {
    private int day;
    private int month;
    private int year;

    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString() {
        return day+"/"+month+"/"+year;
    }
    //String format (String)
}
