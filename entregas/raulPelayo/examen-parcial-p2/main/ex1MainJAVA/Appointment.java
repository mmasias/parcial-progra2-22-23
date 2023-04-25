package main.ex1;

public class Appointment {
    private Client owner;
    private Pet pet;
    CustomDate date;
    String description;

    public Appointment(Pet pet, CustomDate date, String description) {
        this.pet = pet;
        this.date = date;
        this.description = description;
    }
    public String toString(){
        return "Appointment for " + pet.name + " on " + date.toString() + " : " + description;
    }
    public void setOwner(Client owner) {
        this.owner = owner;
    }

}
