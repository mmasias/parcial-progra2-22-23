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
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public String format(String separator) {
        return String.format("%02d%s%02d%s%04d", day, separator, month, separator, year);
    }
}
