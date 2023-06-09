package ex1.Utils.Client;

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

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Client)) return false;
        Client client = (Client) obj;
        return this.name.equals(client.name) && this.surname.equals(client.surname);
    }
}
