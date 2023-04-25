public class Dog extends Pet{

	public String name;
	public  String colo;
	public  int age;

	public Dog(String name, String colo, int age) {
		this.name = name;
		this.colo = colo;
		this.age = age;
	}

	public String getName() {
		return name;
	}
}
