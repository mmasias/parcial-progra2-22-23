package main.ex1.core;

public class Appointment {
    String owner;
    String pet;
    String date;
    String description;
    public Appointment(Client owner, Pet pet, CustomDate date, String description) {
        this.owner = owner.getFullName();
        this.pet = pet.getName();
        this.date = date.format();
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

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
