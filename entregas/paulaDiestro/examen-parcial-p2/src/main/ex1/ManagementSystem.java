package main.ex1;

import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.ArrayList;

public class ManagementSystem {
    private FileHandler fileHandler;
    private List<Client> clients;
    private List<Appointment> appointments;
    private String data;

    public ManagementSystem() throws IOException {
        this.fileHandler = new FileHandler();
        this.clients = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public void addData(String data) {
        this.data = data;
    }
    
    List<Client> getClients(){
        return clients;
    }

    public void addAppointment(Appointment appointment) {
        if (isClient(appointment.getOwner())) {
            this.appointments.add(appointment);
        }
    }

    List<Appointment> getAppointments(){
        return appointments;
    }

    private boolean isClient(Client client) {
        return this.clients.contains(client);
    }
}
