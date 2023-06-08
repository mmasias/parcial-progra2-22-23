package main;

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
        String fullName = name + " " + surname;
        return fullName;
    }

    public boolean equals(Client newClient) {
        if (this.name.equals(newClient.name) && (this.surname.equals(newClient.surname))) {
            return true;
        }
        return false;

    }
}
