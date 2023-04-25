package main.ex1;

import main.ex1.Pet;


public class Appointment {
    Pet pet;
    Client owner;
    CustomDate date;
    String description;

    public Appointment(Pet pet, CustomDate date, String description) {
        this.pet = pet;
        this.date = date;
        this.description = description;
    }

    public String toString() {
        return "[" + date.dateToString() + "] - " + owner.getFullName() + " - " + pet.getName() + " - " + description;


    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }
}
