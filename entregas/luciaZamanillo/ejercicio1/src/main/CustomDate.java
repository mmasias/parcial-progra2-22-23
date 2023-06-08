package main;

public class CustomDate {
    int day;
    int month;
    int year;

    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        String stringDay = Integer.toString(day);
        String stringMonth = Integer.toString(month);
        String stringYear = Integer.toString(year);

        String fullDate = stringDay + "/" + stringMonth + "/" + stringYear;

        return fullDate;
    }


}
