package entregas.esparragozaVeronika.src.main.ex1;

public class CustomDate {
    private int date;
    private int month;
    private int year;

    public CustomDate(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        String dateToString = date+"/"+month+"/"+year;
    return dateToString;
    }
    public String format(String simbol){
        String dateFormat = toString().replaceAll("/", simbol);
        return dateFormat;
    }
}
