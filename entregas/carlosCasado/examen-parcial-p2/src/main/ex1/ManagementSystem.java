package main.ex1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;
    List<Client> clients = new ArrayList<>();
    List<Appointment> appointments = new ArrayList<>();

    public ManagementSystem() {
    }
    public void loadData(String path) {

    for (String rawDataPerClient: fileHandler.loadFileContent(path)) {
        String[] data = rawDataPerClient.split(";");
        String name = data[0].replaceAll("\"", "");
        String surname = data[1].replaceAll("\"", "");
        String address = data[2].replaceAll("\"", "");
        String phoneNumber = data[3].replaceAll("\"", "");

        clients.add(new Client(name, surname, address, phoneNumber));

    }

    }
    public void addAppointment(Appointment appointment, Client client) {
       appointment.setOwner(client);
       appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public List<Client> getClients() {
        return clients;
    }

}
