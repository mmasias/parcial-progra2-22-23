package EX1;

import java.util.Objects;

public class Client implements Client1 {

    private String name;
    private String surname;
    private String address;
    private String phoneNumber;

    Client(String name,String surname,String address,String phoneNumber){

        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    public String getFullName(){

        return name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Client c) {
        if (this == c) return true;
        if (c == null || getClass() != c.getClass()) return false;
        Client client = (Client) c;
        return Objects.equals(name, client.name) && Objects.equals(surname, client.surname) && Objects.equals(address, client.address) && Objects.equals(phoneNumber, client.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, address, phoneNumber);
    }
}
