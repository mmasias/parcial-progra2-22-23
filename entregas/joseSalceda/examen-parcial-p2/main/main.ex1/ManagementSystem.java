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
        List<String> lines = fileHandler.loadFileContent(path);
        for (String line : lines) {
            String[] data = line.split(",");
            Client client = new Client(data[0], data[1], data[2], data[3]);
            if (!isClient(client)) {
                clients.add(client);
            }
            Pet pet = null;
            if (data[4].equals("Dog")) {
                pet = new Dog(data[5], data[6], Integer.parseInt(data[7]));
            } else if (data[4].equals("Cat")) {
                pet = new Cat(data[5], data[6], Integer.parseInt(data[7]));
            }
            CustomDate date = new CustomDate(Integer.parseInt(data[8]), Integer.parseInt(data[9]), Integer.parseInt(data[10]));
            Appointment appointment = new Appointment(pet, date, data[11]);
            appointment.setOwner(client);
            appointments.add(appointment);
        }
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addAppointment(Appointment appointment, Client client) {
        if (isClient(client)) {
            appointment.setOwner(client);
            appointments.add(appointment);
        }
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    private boolean isClient(Client client) {
        for (Client c : clients) {
            if (c.equals(client)) {
                return true;
            }
        }
        return false;
    }
}