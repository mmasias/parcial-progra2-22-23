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

    public Appointment(Pet dog, CustomDate date, String vaccination) {

    }

    @Override
    public String toString() {
        return "Appointment{" +
                "owner=" + owner +
                ", pet=" + pet +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }


    public void setOwner(Client client){


        owner = new Client(client);


    }
}
