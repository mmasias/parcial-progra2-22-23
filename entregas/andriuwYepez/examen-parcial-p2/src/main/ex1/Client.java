package main.ex1;

public class Client {
    private String name;
    private String surName;
    private String address;
    private String phoneNumber;

    public Client(String name, String surName, String address, String phoneNumber){
        this.name = name;
        this.surName = surName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName(String fullName){
        return fullName = this.name + this.surName;
    }

    public boolean equals(boolean client){
        return client;
    }
}
