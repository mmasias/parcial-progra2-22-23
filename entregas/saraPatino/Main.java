package entregas.saraPatino;

import entregas.saraPatino.src.main.Client;
import entregas.saraPatino.src.main.Dog;
import entregas.saraPatino.src.main.Cat;
import entregas.saraPatino.src.main.Appointment;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Sara", "Patino", "Calle 1", "123456789");
        System.out.println(client.getFullName());

        Dog dog = new Dog("Toby", "Brown", 2);
        System.out.println(dog.getName());

        Cat cat = new Cat("Miau", "White", 1);
        System.out.println(cat.getName());

        String description = "Toby is sick";

        Appointment appointment = new Appointment(client, dog, description);
        System.out.println(appointment.description);
    }
}
