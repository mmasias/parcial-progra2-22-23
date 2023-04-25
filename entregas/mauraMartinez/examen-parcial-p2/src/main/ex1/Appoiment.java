package main.ex1;

public class Appoiment {
    private Client owner;
    private Pet pet;
    private CustomDate date;
    private String description;

    public Appoiment(Pet pet, CustomDate date, String description) {
        this.pet = pet;
        this.date = date;
        this.description = description;
    }

    public String toString() {
        return "Appointment{" +
                "owner=" + owner +
                ", pet=" + pet +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }
}

