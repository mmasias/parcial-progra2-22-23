package main.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;

    private List<Client> clients;

    private List<Appointment> appointments;

    public ManagementSystem() {
        this.clients = new ArrayList<>();
        this.appointments = new ArrayList<>();
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

        FileHandler file = new FileHandler();

        List<String> lines = file.loadFileContent(path);

        int i = 0;

        for (String line: lines
             ) {
            String[] data = line.split(";");

            if (i != 0){
                // Extract data from line and remove quotes
                String name = data[0].replaceAll("\"", "");
                String surname = data[1].replaceAll("\"", "");
                String address = data[2].replaceAll("\"", "");
                String phoneNumber = data[3].replaceAll("\"", "");

                Client client = new Client(name, surname, address, phoneNumber);

                this.clients.add(client);
            }
            i++;
        }


    }
    public void addAppointment(Appointment appointment, Client client) {
       this.appointments.add(appointment);
       this.clients.add(client);
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }
}
