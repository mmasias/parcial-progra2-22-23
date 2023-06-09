package main.ex1;

import java.util.List;

public class Appointment {
    public Client owner;
    public Pet pet;
    public CustomDate date;
    public String description;

    public Appointment(Pet pet, CustomDate date, String description) {
        this.pet = pet;
        this.date = date;
        this.description = description;
    }

    public String toString() {
        return "Appointment [owner=" + owner + ", pet=" + pet + ", date=" + date + ", description=" + description + "]";
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }
}