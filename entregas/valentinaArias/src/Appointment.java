public class Appointment extends CustomDate, Client, Pet {
	private Client Owner;
	private Pet pet;
	private CustomDate date;
	private String description;

	public Appointment() {
		super();
		this.Owner = Owner;
		this.pet = pet;
		this.date = date;
		this.description = description;
	}
	//En la clase Appointment en el método toString debe retornar un string con este formato.
	//create return Appointment for 01/01/2019 on 01/01/2019 with John Doe (description)

	public String toString() {
		//En la clase Appointment en el método toString debe retornar un string con este formato.
		//create return Appointment for 01/01/2019 on 01/01/2019 with John Doe (description)
		return "Appointment for " + date.gedate() + " on " + date + " with " + Owner.getName() + " (" + description + ")";
	}

	public void setOwner(Client Owner) {
		this.Owner = Owner;


	}
}