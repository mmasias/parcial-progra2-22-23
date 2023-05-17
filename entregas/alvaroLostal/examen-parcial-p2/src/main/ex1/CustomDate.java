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
        String d = day < 10 ? "0" + day : String.valueOf(day);
        String m = month < 10 ? "0" + month : String.valueOf(month);
        return d + "/" + m + "/" + year;
    }
    public String format(String separator) {
        String d = day < 10 ? "0" + day : String.valueOf(day);
        String m = month < 10 ? "0" + month : String.valueOf(month);
        return d + separator + m + separator + year;
    }
}
