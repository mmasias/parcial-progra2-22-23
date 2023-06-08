package ex1.Core;

import ex1.Utils.Client.Client;
import ex1.Utils.CustomDate.CustomDate;
import ex1.Utils.Pets.Pet;

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

    public CustomDate getDate() {
        return this.date;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("[%s] - %s - %s - %s", this.date.toString(), this.owner.getFullName(), this.pet.getName(), this.description);
    }
}
