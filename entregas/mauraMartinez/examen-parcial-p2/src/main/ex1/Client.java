package main.ex1;

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
    
    public boolean equals(Client other) {
        return this.name.equals(other.name) &&
               this.surname.equals(other.surname) &&
               this.address.equals(other.address) &&
               this.phoneNumber.equals(other.phoneNumber);
    }
    {
        
    }
}
