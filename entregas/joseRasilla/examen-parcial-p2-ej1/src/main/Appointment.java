package main;

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

    public String toString(){
        String returnedString = "[" + date.toString() + "] - " + owner.getFullName() + " - " + pet.getName() + " - " + description;
        return returnedString;
    }

    public void setOwner(Client petOwner){
        this.owner = petOwner;
    }
}