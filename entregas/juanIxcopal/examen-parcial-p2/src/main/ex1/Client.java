package main.ex1;

public class Client {
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;

    public Client(String name, String surname, String address, String phoneNumber){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName(){
        return name + " " + surname;
    }

    public boolean equals(Client otherClient){
        if (otherClient == null) {
            return false;
        }
        if (this == otherClient) {
            return true;
        }
        return this.name.equals(otherClient.name) &&
            this.surname.equals(otherClient.surname) &&
            this.address.equals(otherClient.address) &&
            this.phoneNumber.equals(otherClient.phoneNumber);
    }
}