package main.ex1;

public class Appointment extends Pet   {

	Client owner = new Client();
	Pet pet = new Pet(nameP, color, age);
	CustomDate date = new CustomDate(age, age, age);
	String description = new String();
	
	
	public Appointment(String Pet, String CustomDate, int String ) {
		super(Pet, CustomDate, String);
		
	}
	public String toString() {
		String f = "["+ date +"]"+" - "+ owner +" - " + nameP +" - " + description;
		
		return f;
	}
	
	
	public Client getOwner() {
		return owner;
	}
	public void setOwner(Client owner) {
		this.owner = owner;
	}
	

	
}
