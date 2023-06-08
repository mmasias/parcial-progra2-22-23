package main.ex1;

public class CustomDate {
    int day;
    int month;
    int year;

    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day+"/"+month+"/"+year;
    }

    public String format(String format) {
        String[] parts = format.split("/");
        String result = "";
        for (String part : parts) {
            switch (part) {
                case "dd":
                    result += this.day;
                    break;
                case "mm":
                    result += this.month;
                    break;
                case "yyyy":
                    result += this.year;
                    break;
                default:
                    result += part;
                    break;
            }
            result += "/";
        }
        return result.substring(0, result.length()-1);
    }


}
