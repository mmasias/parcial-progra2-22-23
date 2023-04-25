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

    public Client(Client client) {

        this.name="elder";
        this.surname= "bol";
        this.address="dsad";
        this.phoneNumber= "54i3";
    }

    public String getFullName(){

        return this.name + " " + this.surname;
    }

    public boolean equals (Client client2){

        Client cliente1 = new Client("daniel","Roldan", "Camare","874283");

        if (cliente1.getFullName().equals(client2)){
            return true;
        }
        return false;
    }
}
