package main.ex1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;
    List<Client> clients = new ArrayList<>();

    public ManagementSystem() {
    }
    public void loadData(String path) {

    for (String rawDataPerClient: fileHandler.loadFileContent("data/clients.dat")) {
        String[] data = rawDataPerClient.split(";");
        String name = data[0].replaceAll("\"", "");
        String surname = data[1].replaceAll("\"", "");
        String address = data[2].replaceAll("\"", "");
        String phoneNumber = data[3].replaceAll("\"", "");

        clients.add(new Client(name, surname, address, phoneNumber));

    }

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
    }

}
