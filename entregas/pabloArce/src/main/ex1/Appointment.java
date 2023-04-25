package main.ex1;

public class Appointment {
    private Client owner;
    private Pet pet;
    private CustomDate date;
    private String description;
    public Appointment(Pet pet, CustomDate date, String description) {
        this.pet = pet;
        this.date = date;
        this.description = description;
    }
    public String toString() {
        return "[" + date.toString() + "] - " + owner.getFullName() + " - " + pet.name + " - " + description;
    }
    public void setOwner(Client owner) {
        this.owner = owner;
    }
}
