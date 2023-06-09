package main.ex1;

import org.junit.jupiter.api.DisplayNameGenerator;

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
        return day + "/" + month + "/" + year;
    }

    public String format(String symbol) {
        return day + symbol + month + symbol + year;
    }

}
