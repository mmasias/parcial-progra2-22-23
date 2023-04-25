package src.main.ex1;

public class Appointment {
	private String description;
	private Client owner;
	private Pet pet;
	private CustomDate date;
	public Appointment(String description, Pet pet, CustomDate date) {
		this.description = description;
		this.pet = pet;
		this.date = date;
	}
	public String toString() {
		return this.description + " " + this.pet.getName() + " " + this.date.format("dd/mm/yyyy");
	}
	public void setOwner(Client owner) {
		this.owner = owner;
	}


}
