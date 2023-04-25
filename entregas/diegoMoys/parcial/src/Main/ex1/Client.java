package Main.ex1;

public class Client {
    protected String name;
    protected String surname;
    protected  String address;
    protected String phoneNumber;

    public Client(String name, String surname, String address, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public boolean equals(Client client) {
        return this.name.equals(client.name) && this.surname.equals(client.surname) && this.address.equals(client.address) && this.phoneNumber.equals(client.phoneNumber);
    }
}
