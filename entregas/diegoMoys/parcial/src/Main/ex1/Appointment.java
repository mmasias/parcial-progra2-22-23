package Main.ex1;

public class Appointment {
    private CustomDate date;
    private Client client;
    private Pet pet;
    private String description;

    public Appointment(CustomDate date, Client client, Pet pet, String description) {
        this.date = date;
        this.client = client;
        this.pet = pet;
        this.description = description;
    }

    public void setOwner(Client client) {
        this.client = client;
    }

    public String toString() {
        return "[" + this.date.dateToString() + "] - " + this.client.getFullName() + " - " + this.pet.getName() + " - " + this.description;
    }

}
