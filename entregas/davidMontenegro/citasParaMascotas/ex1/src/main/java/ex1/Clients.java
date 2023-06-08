package ex1;

public class Clients {
    private String name;
    private String surname;
    private String address;

    public Clients(String name, String surname, String address){
        this.name = name;
        this.surname = surname;
        this.address = address;
    }
    public String getFullName(String name, String surname){
        return (name + " " + surname);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public String getSurname() {
        return surname;
    }
}
