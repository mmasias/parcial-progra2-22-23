package main.ex1;

public class Client extends ManagementSystem{
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;

    public <<Create>> Client(String, String, String, String);
    public String getFullName(){
        return name + " " + surname;
    }
    public boolean equals(Client);
}
