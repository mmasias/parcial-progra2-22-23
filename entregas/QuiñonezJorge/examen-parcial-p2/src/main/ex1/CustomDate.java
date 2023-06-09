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
        return String.format("%02d%s%02d%s%d", this.day, "/", this.month, "/", this.year);
    }

    public String format(String splitter) {
        return String.format("%02d%s%02d%s%d", this.day, splitter, this.month, splitter, this.year);
    }
}
