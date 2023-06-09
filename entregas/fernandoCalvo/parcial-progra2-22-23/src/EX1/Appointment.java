package EX1;

public class Appointment {

    Client owner;
    Pet pet;
    CustomDate date;
    String description;

    Appointment(Pet pet,CustomDate date,String description){

        this.pet = pet;
        this.date = date;
        this.description = description;

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

    public void setOwner(Client owner) {
        this.owner = owner;
    }
}
