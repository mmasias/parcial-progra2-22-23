package main.ex1;

public class Appointment {
    private Client owner;
    private Pet pet;
    private CustomDate date;
    private String description;

    public Appointment(Client owner, Pet pet, CustomDate date, String description) {
        this.owner = owner;
        this.pet = pet;
        this.date = date;
        this.description = description;
    }
    public String toString() {
        return "Appointment: "+date.toString()+"\n"+pet.toString()+"\n"+description;
    }
    public void setOwner(Client owner) {
        this.owner = owner;
    }
}