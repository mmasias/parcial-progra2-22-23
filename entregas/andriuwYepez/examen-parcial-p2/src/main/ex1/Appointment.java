package main.ex1;

public class Appointment {
    public Client owner;
    public Pet pet;
    public CustomDate date;
    public String description;

    public Appointment(Client owner, Pet pet, CustomDate date, Sring description){
        this.owner = owner;
        this.pet = pet;
        this.date = date;
        this.description = description;
    }

    public String toString(String toString){
        return toString;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }
}
