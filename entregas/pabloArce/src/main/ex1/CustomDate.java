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
    public String toString() {
        String currentMonth;
        if (this.month < 10) {
            currentMonth = "0" + String.valueOf(this.month);
        }
        else{currentMonth = String.valueOf(this.month);}
        return (this.day + "/" + currentMonth + "/" + this.year);
    }
    public String format(String format){
        String currentMonth;
        if (this.month < 10) {
            currentMonth = "0" + String.valueOf(this.month);
        }
        else{currentMonth = String.valueOf(this.month);}
        return format.replace("dd", String.valueOf(this.day)).replace("mm", currentMonth).replace("yyyy", String.valueOf(this.year));
    }
}
