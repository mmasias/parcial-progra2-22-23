package main.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;
    private List<Client> clients;
    private List<Appointment> appointments;


    public ManagementSystem() {
        fileHandler = new FileHandler();
        clients = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void loadData(String path) {
        List<String> lines = fileHandler.loadFileContent(path);
        for (String line : lines) {
            String[] data = line.split(";");
            String name = data[0].replaceAll("\"", "");
            String surname = data[1].replaceAll("\"", "");
            String address = data[2].replaceAll("\"", "");
            String phoneNumber = data[3].replaceAll("\"", "");
            Client client = new Client(name, surname, address, phoneNumber);
            clients.add(client);
        }
    }

    public List<Client> getClients(){
        return clients;
    }

    public void addAppointment(Appointment appointment, Client client) {
        if (isClient(client)) {
            appointment.setOwner(client);
            appointments.add(appointment);
        } else {
            throw new IllegalArgumentException("Invalid client");
        }
    }

    public List<Appointment> getAppointments(){
        return appointments;
    }

    private boolean isClient(Client client){
        return clients.contains(client);
    }

}
