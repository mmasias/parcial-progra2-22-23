public class AppointmentTest {
	public static void main(String[] args) {
		Client client = new Client("John Doe", "123 Main St", "555-555-5555");
		Pet pet = new Pet("Fido", "Brown", 3);
		Cat cat = new Cat("Felix", "Black", 2);
		System.out.println(client.equals(pet));
		System.out.println(pet.equals(cat));
		System.out.println(cat.equals(client));
	}

}
