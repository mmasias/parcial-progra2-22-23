package src.main.ex1;

public class Client {
	private String name;
	private String surname;
	private String adress;
	private String phoneNumber;

	public Client(String name, String surname, String adress, String phoneNumber) {
		this.name = name;
		this.surname = surname;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
	}
	public String getFullName() {
		return this.name + " " + this.surname;
	}
	public boolean equals(Client client) {
		return this.name.equals(client.name) && this.surname.equals(client.surname);
	}
}
