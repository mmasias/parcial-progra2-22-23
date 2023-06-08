package main.ex1;

import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {
    FileHandler fileHandler;
    List<Client> clients;
    List<Appointment> appointments;

    public ManagementSystem() {
        this.clients = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }
    void loadData(String path) {
        List<String> lines = this.fileHandler.loadFileContent(path);
        for (String line : lines) {
            String[] data = line.split(",");
            Client client = new Client(data[0], data[1], data[2], data[3]);
            this.clients.add(client);
        }
    }

    public List<Client> getClients() {
        return clients;
    }


    void addAppointment(Appointment appointment, Client client) {
        this.appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    private boolean isClient(Client client) {
        for (Appointment appointment : this.appointments) {
            if (appointment.owner.equals(client)) {
                return true;
            }
        }
        return false;
    }


}
