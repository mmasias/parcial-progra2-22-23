//CustomDate

public class CustomDate {
    private int day;
    private int month;
    private int year;
    private String separator = "/";

    public CustomDate(int day, int month, int year, String separator) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.separator = separator;
    }

    public String toString() {
        return day + separator + month + separator + year;
    }

    public String format(String format) {
        return toString();
    }
}