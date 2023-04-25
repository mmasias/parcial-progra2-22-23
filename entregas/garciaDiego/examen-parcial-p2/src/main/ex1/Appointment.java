package main.ex1;

public class Appointment {
    Client owner;
    Pet pet;
    CustomDate date;
    String description;

    public Appointment(Client owner, Pet pet, CustomDate date, String description) {
        this.owner = owner;
        this.pet = pet;
        this.date = date;
        this.description = description;
    }

    public String toString() {
        return this.date.toString()+" - "+ this.owner.getFullName()+" - "+this.pet.getName()+" - "+ this.description ;
    }

    void setOwner(Client owner) {
        this.owner = owner;
    }

}
