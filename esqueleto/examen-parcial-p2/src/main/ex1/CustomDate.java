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

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String format(String separador){

        String separator= separador;
        CustomDate date = new CustomDate(25,03,2023);

        date.format(separador);

        String formatear;

        formatear = date.format("-");
       // String dia = String.valueOf(date.getDay());
        //String mes = String.valueOf(date.getMonth());
        //String year = String.valueOf(date.getYear());

       // formatear = dia+separador+mes+separador+year;

        return formatear;
    }


    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
