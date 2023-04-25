package main.ex1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem {
    private List<Client> clients = new ArrayList<>();
    public ManagementSystem() {
        this.clients = new ArrayList<>();
    }

    public void loadData(String path) {

        FileHandler fileHandler = new FileHandler();
        List<String> listClients;
        try {
            listClients = fileHandler.loadFileContent(path);
            Client client;
            String name, surname, address, phoneNumber;
            for (String line : listClients) {
                String[] lineData = line.split(";");
                name = lineData[0].replaceAll("\"", "");
                surname = lineData[1].replaceAll("\"", "");
                address = lineData[2].replaceAll("\"", "");
                phoneNumber = lineData[3].replaceAll("\"", "");
                client = new Client(name, surname, address, phoneNumber);
                this.clients.add(client);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    public void addAppointment(Appointment appointment, Client client) {
        // Add appointment to list
        this.appointments.add(appointment);
        // Add appointment to client
        client.addAppointment(appointment);
    }

}