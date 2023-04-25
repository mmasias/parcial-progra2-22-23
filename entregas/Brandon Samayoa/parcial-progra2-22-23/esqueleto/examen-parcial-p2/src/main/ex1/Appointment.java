
package main.ex1;

public class Appointment {

    private Pet pet;
    private CustomDate date;
    private String description;
    private Client owner;

    public Appointment(Pet pet, CustomDate date, String description) {
        this.pet = pet;
        this.date = date;
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public CustomDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "[" + date.toString() + "] - " + owner.toString() + " - " + pet.getName() + " - " + description;
    }

}