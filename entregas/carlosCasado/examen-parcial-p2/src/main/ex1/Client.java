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

/*
    public boolean equals(Client client) {
        //return client.getFullName().equals()
        //if (client.getFullName().equals())
    }
*/
}
