package main.ex1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;
    private List<Client> clients;
    private List<Appointment> appointments;

    public ManagementSystem() {
        this.clients = new ArrayList<>();
        this.fileHandler = new FileHandler();
        this.appointments = new ArrayList<>();

    }

    public void loadData(String path) {
        List<String> listClients = fileHandler.loadFileContent(path);
        String name, surname, address, phoneNumber;
        int cont=0;
        for (String line : listClients) {
            String[] lineData = line.split(";");
            name = lineData[0].replaceAll("\"", "");
            surname = lineData[1].replaceAll("\"", "");
            address = lineData[2].replaceAll("\"", "");
            phoneNumber = lineData[3].replaceAll("\"", "");
            Client client = new Client(name, surname, address, phoneNumber);
            if(cont>0){
                this.clients.add(client);
            }
            cont++;

        }
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment, Client client) {
        appointment.setOwner(client);
        this.appointments.add(appointment);
    }

    boolean isClient(Client client) {
        for (Client c : this.clients) {
            if (c.equals(client)) {
                return true;
            }
        }
        return false;
    }
}