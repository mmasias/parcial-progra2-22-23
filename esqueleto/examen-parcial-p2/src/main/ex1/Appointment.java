package main.ex1;

public class Appointment {
    private String date;
    private String time;
    private String description;
    private String client;

    public Appointment(String date, String time, String description, String client) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.client = client;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public String getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "appoiment{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", client='" + client + '\'' +
                '}';
    }
    
}
