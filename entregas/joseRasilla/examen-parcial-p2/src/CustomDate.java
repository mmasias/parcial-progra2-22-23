public class CustomDate {
    private int day;
    private int month;
    private int year;

    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return format("/");
    }

    public String format(String separator){
        String formatedDate = day + separator + month + separator + year;
        return formatedDate;
    }

}