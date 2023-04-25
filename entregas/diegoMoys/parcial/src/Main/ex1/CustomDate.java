package Main.ex1;

public class CustomDate {
    private int date;
    private int month;
    private int year;

    public CustomDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String dateToString() {
        return this.date + "/" + this.month + "/" + this.year;
    }

}
