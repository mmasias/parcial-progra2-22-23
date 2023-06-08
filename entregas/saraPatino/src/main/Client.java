package entregas.saraPatino.src.main;

public class Client {
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;

    public Client(String name, String surname, String address, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public boolean equals(Client client) {
        return this.name.equals(client.name) && this.surname.equals(client.surname) && this.address.equals(client.address)
                && this.phoneNumber.equals(client.phoneNumber);
    }
}
