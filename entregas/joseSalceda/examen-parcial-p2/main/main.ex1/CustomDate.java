package main.ex1;

import java.util.List;

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
        return "CustomDate [day=" + day + ", month=" + month + ", year=" + year + "]";
    }

    public String format(String format) {
        String formattedDate = format;
        formattedDate = formattedDate.replace("dd", String.valueOf(day));
        formattedDate = formattedDate.replace("mm", String.valueOf(month));
        formattedDate = formattedDate.replace("yyyy", String.valueOf(year));
        return formattedDate;
    }
}