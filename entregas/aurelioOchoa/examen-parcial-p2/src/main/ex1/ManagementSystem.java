package main.ex1;

import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;
    private List<Client> clients;
    private List<Appointment> appointments;

    public ManagementSystem() {
        this.fileHandler = new FileHandler();
        this.clients = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public void loadData(String path) {
        List<String> fileContent = fileHandler.loadFileContent(path);

        if (fileContent != null) {
            for (String line : fileContent) {
                String[] data = line.split(";");
                String name = data[0].replaceAll("\"", "");
                String surname = data[1].replaceAll("\"", "");
                String address = data[2].replaceAll("\"", "");
                String phoneNumber = data[3].replaceAll("\"", "");

                Client client = new Client(name, surname, address, phoneNumber);
                clients.add(client);
            }
        }
    }

    public List<Client> getClients() {
        return this.clients;
    }

    public void addAppointment(Appointment appointment, Client client) {
        if (isClient(client)) {
            appointment.setOwner(client);
            this.appointments.add(appointment);
        } else {
            System.err.println("Client not found");
        }
    }

    public List<Appointment> getAppointments() {
        return this.appointments;
    }

    private boolean isClient(Client client) {
        return clients.contains(client);
    }
}
