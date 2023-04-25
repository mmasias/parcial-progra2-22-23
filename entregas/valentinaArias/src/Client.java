public class Client extends Appointment{
	private String name;
	private String address;
	private String phoneNumber;
	public Client(String name, String address, String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}



	public String getFullName() {
		return name;
	}
	public boolean equals(Client) {
		return name.equals(getFullName()) && address.equals(.address) && phoneNumber.equals(other.phoneNumber);
	}
}
