package ex1.Utils.CustomDate;

public class CustomDate {
    int day;
    int month;
    int year;

    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    public String format(String s) {
        return this.day + s + this.month + s + this.year;
    }
}
