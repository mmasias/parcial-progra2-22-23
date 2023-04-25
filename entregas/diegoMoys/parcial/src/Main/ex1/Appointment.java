package Main.ex1;

public class Appointment {
    private CustomDate date;
    private Client client;
    private Pet pet;
    private String description;

    public Appointment(Pet pet, CustomDate date, String description) {
        this.pet = pet;
        this.date = date;
        this.description = description;
    }


    public void setOwner(Client client) {
        this.client = client;
    }

    public String toString() {
        return "[" + this.date.dateToString() + "] - " + this.client.getFullName() + " - " + this.pet.getName() + " - " + this.description;
    }

}
