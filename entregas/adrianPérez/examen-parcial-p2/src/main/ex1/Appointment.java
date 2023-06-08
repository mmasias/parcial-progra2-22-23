package main.ex1;

public class Appointment{
    Client owner;
    Pet pet;
    CustomDate date;
    String description;

    public <<Create>> Appointment(Client, Pet, CustomDate, String);
    public void setOwner(Client){
        this.owner = owner;
    }
    public String toString(){
        return "Appointment: " + pet.getName() + " " + date.toString() + " " + description;
    }
}
