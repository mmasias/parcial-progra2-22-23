package Main.ex1;

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

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public String toString(){
        return "Owner[" + owner + "]" + "Pet[" + pet + "]" + "Date[" + date + "]" + "Description[" + description + "]";
    }

}


