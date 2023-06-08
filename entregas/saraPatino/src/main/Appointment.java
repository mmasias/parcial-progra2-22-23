package entregas.saraPatino.src.main;

public class Appointment {
    public Client owner;
    public Pet pet;
    public String description;

    public Appointment(Client owner, Pet pet, String description) {
        this.owner = owner;
        this.pet = pet;
        this.description = description;
    }

    Appointment createAppointment(Client owner, Pet pet, String description) {
        Appointment appointment = new Appointment(owner, pet, description);
        return appointment;
    }


    public void setOwner(Client owner) {
        this.owner = owner;
    }
}
