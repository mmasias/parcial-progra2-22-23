package main.ex1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;
    List<Client> clients = new ArrayList<>();
    List<Appointment> appointments = new ArrayList<>();
    private Appointment appointment;
    private Client client;

    public ManagementSystem() {
    }

    public void loadData(String path) {
        /*
            Load clients from file

            // For each line in file


        String[] data = line.split(";");

             // Extract data from line and remove quotes
            String name = data[0].replaceAll("\"", "");
            String surname = data[1].replaceAll("\"", "");
            String address = data[2].replaceAll("\"", "");
            String phoneNumber = data[3].replaceAll("\"", "");


            // Create client and add to list

            */
    }



    public void addAppointment(Appointment appointment, Client client) {
        // Add appointment to list
        this.appointment = appointment;
        this.client = client;
    }

    public List<Client> getClients() {
        return clients;
    }
    public List <Appointment> getAppointments(){
        return appointments;
    }
    boolean isClient(Client client) {
        return this.client.equals(client);
    }
}