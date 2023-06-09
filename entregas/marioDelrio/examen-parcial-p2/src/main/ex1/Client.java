package main.ex1;

public class Client {
    String name;
    String surname;
    String address;
    String phoneNumber;

    public Client(String name, String surname, String address, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    String getName() {
        return name;
    }
    boolean equals(Client client) {
        return this.name.equals(client.name) && this.surname.equals(client.surname);
    }
}




