package Main.ex1;

public class CustomDate {
    protected int date;
    protected int month;
    protected int year;

    public CustomDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String dateToString() {
        return this.date + "/" + this.month + "/" + this.year;
    }
}
