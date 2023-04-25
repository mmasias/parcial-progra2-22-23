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
        return String.format("%d/%d/%d", day, month, year);
    }

    public String format(String separator) {
        return String.format("%d%s%d%s%d", day, separator, month, separator, year);
    }


}
