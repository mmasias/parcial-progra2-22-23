//CustomDate - Test OK

public class CustomDate {
    private int day;
    private int month;
    private int year;
    private String separator = "/";

    // Constructor with separator parameter
    public CustomDate(int day, int month, int year, String separator) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.separator = separator;
    }

    // Constructor without separator parameter (uses default separator)
    public CustomDate(int day, int month, int year) {
        this(day, month, year, "/");
    }

    public String toString() {
        String formattedDay = String.format("%02d", day);
        String formattedMonth = String.format("%02d", month);
        return formattedDay + separator + formattedMonth + separator + year;
    }

    public String format(String format) {
        return toString();
    }
}
