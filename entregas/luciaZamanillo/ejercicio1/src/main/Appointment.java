package main;

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
        String fullDate = date.toString();
        String fullName = owner.getFullName();
        String petName = pet.getName();

        String fullInfo = "[" + fullDate + "]" + " - " + fullName + " - " + petName + " - " + this.description;
        return fullInfo;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }
}
