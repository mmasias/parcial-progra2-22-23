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
    public void addAppointment(Appointment appointment, Client client) {
        if (client == null) {
            System.err.println("Client is null");
            return;
        }
        if (appointment == null) {
            System.err.println("Appointment is null");
            return;
        }
        if (this.clients.contains(client)) {
            client.addAppointment(appointment);
        } else {
            System.err.println("Client not found");
        }
    }

}