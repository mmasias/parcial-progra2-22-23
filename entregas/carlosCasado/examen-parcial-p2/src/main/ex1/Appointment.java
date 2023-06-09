package main.ex1;

public class Appointment {

    Client owner;
    Pet pet;
    CustomDate date;
    String description;

    public Appointment(Pet pet, CustomDate date, String description) {
        this.pet = pet;
        this.date = date;
        this.description = description;
    }

    public String toString() {
        return "[" + date + "]" + " - " + owner.getFullName() + " - " + pet.name + " - " + description;
    }

    public void setOwner(Client client) {
        this.owner = client;
    }

}
