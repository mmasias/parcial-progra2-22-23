package main.ex1;

public class Client {
    String name;
    String surName;
    String address;
    String phoneNumber;

    public Client(String name, String surName, String address, String phoneNumber) {
        this.name = name;
        this.surName = surName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return name+" "+surName;
    }

    boolean equals(Client client) {
        return this.name.equals(client.name) && this.surName.equals(client.surName);
    }

}
