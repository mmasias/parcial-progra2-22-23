package main;

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

    public String getFullName(){
        String fullname = name + " " + surname;
        return fullname;
    }
    public boolean equals(Client client){
        if (client.name == this.name && client.surname == this.surname){
            return true;
        }
        else return false;
    }

}