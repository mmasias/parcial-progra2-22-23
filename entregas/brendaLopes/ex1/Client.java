package main.ex1;

public class Client {
    //name, surname, address, phonenumber
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

    public String getName() {

        return name;
    }

    public boolean equals(Client client) {

        return super.equals(client);
    }
}