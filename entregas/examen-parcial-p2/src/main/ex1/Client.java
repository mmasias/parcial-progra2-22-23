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
    public boolean isClient(String name, String surname) {
        return this.name.equals(name) && this.surname.equals(surname);
    }

}
