public class Client {
    String name;
    String surname;
    String adress;
    String phoneNumber;

    public Client(String name, String surname, String adress, String phoneNumber) {

    }
    this.name=name;
    this.surname=surname;
    this.adress=adress;
    this.phoneNumber=phoneNumber;
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
    
    public boolean equals(Client obj) {
        return super.equals(obj);
    }
}
