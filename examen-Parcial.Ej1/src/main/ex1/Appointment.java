package main.ex1;

public class Appointment {
    private Client owner;
    protected Pet pet;
    protected CustomDate date;
    protected String description;


    public Appointment(Pet pet, CustomDate date, String description) {
        this.owner = owner;
        this.pet = pet;
        this.date = date;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "owner=" + owner +
                ", pet=" + pet +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }

    public void setOwner(Client client) {
    }
}
