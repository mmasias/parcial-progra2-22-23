package main.ex1;

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

    @Override
    public String toString() {
        return "["+ this.date.toString() +"] - "+ this.owner.getFullName() + " - " + this.pet.getName() + " - " + this.description;
    }

    public void setOwner(Client client)
    {
        this.owner = client;
    }
}
