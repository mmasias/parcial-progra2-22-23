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

     String getFullName(){

        String fullname=name + surname;

        return fullname;
    }

     boolean equals(Client cliente){

        boolean iguales = false;
        Client ctemp;


        //if (cliente.name.equalsIgnoreCase(cliente))

    return iguales;
    }
}
