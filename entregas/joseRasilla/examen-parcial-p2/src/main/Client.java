public class Client {
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;

    public String getFullName(){
        String fullname = name + " " + surname;
        return fullname;
    }
    public boolean equals(Client client){
        if (client.getFullName() == this.getFullName()){
            return true;
        }
        else return false;
    }

}