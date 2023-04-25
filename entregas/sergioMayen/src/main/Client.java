package main;

public class Client {
    public String name;
    public String surname;
    public String address;
    public String phoneNumber;


    public Client(String name, String surname, String address, String phoneNumber){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getsurName(){
        return surname;
    }

    public void setsurName(String surname){
        this.surname = surname;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getphoneNumber(){
        return phoneNumber;
    }

    public void setphoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
