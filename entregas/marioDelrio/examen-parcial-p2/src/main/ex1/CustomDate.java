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

    @Override
    public String toString() {
        return "CustomDate{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }
    public String format(String format) {
        return format.replace("dd", String.valueOf(day)).replace("mm", String.valueOf(month)).replace("yyyy", String.valueOf(year));
    }
}
