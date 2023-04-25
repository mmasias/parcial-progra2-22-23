package main.ex1;

public class Appointment {
    //~ Client owner
    //~ Pet pet
    //~ CustomDate date
    //~ String description
    //+ <<Create>> Appointment(Pet,CustomDate,String)
    //+ String toString()
    //+ void setOwner(Client)

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

}