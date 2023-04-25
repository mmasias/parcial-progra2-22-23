package main.ex1;

public class CustomDate {
    int day;
    int month;
    int year;

    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        return day + "/" + month + "/" + year;
    }
    public String format(){
        return year + "-" + month + "-" + day;
    }
}