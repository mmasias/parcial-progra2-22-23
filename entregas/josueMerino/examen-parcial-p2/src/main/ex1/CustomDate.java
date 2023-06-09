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
        return  day +
                "/" + "0"+ month +
                "/" + year ;
    }

    public String format(String format)
    {
        return  day +
                format+ "0"+ month +
                format+ year ;
    }
}
