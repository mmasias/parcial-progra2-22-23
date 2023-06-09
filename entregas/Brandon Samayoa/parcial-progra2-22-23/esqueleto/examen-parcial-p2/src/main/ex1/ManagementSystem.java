package main.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementSystem {

    private List<Client> clients;
    private List<Appointment> appointments;

    public ManagementSystem() {
        clients = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void loadData(String filePath) {
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                String name = data[0];
                String surname = data[1];
                String address = data[2];
                String phoneNumber = data[3];
                Client client = new Client(name, surname, address, phoneNumber);
                clients.add(client);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
    }

    public void addAppointment(Appointment appointment, Client client) {
        client.addAppointment(appointment);
        appointments.add(appointment);
    }
}
