package main.ex1;

public class CustomDate {
    protected int day;
    protected int month;
    protected int year;

    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "CustomDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
    public String format(String format){
String separator="/";
String finalFormat=day+separator+month+separator+year;

return finalFormat;
    }
}
