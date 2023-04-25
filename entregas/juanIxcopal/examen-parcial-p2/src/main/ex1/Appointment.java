package main.ex1;

public class Appointment {

    private Client owner;
    private Pet pet;
    private CustomDate date;
    private String description;

    public Appointment( Pet pet, CustomDate date, String description){

    }

    public String toString(){
        return "[" + date.format("dd/MM/yyyy") + "] - " + owner.getFullName() + " - " + pet.getName() + " - " + description;
    }

    public void setOwner(Client client) {
        this.owner = client;
    }
}