package main.ex1;

public class CustomDate {
    private int day;
    private int month;
    private int year;

    public <<Create>> CustomDate(int, int, int);
    public String toString(){
        return day + "/" + month + "/" + year;
    }
    public String format(String){
        return day + "/" + month + "/" + year;
    }
}
