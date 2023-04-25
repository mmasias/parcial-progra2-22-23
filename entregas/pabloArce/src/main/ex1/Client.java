package main.ex1;

public class Client {
    private String name;
    private String Surname;
    private String address;
    private String phoneNumber;
    public Client (String name, String Surname, String address, String phoneNumber){
        this.name = name;
        this.Surname = Surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getFullName() {
        return this.name + " " + this.Surname;
    }
    public boolean equals(Client client) {
        return this.name.equals(client.name) && this.Surname.equals(client.Surname) && this.address.equals(client.address) && this.phoneNumber.equals(client.phoneNumber);
    }
}

