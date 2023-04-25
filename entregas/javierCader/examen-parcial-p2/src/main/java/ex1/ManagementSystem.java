package ex1;

import ex1.Core.Appointment;
import ex1.Utils.Client.Client;

import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;
    private List<Client> clients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public ManagementSystem() {
        this.fileHandler = new FileHandler();
    }

    public void loadData(String path) {

        List<String> data = fileHandler.loadFileContent(path);

        data.forEach(line -> {
            String[] lineData = line.split(";");

            // Extract data from line and remove quotes
            String name = lineData[0].replaceAll("\"", "");
            String surname = lineData[1].replaceAll("\"", "");
            String address = lineData[2].replaceAll("\"", "");
            String phoneNumber = lineData[3].replaceAll("\"", "");

            // Create client and add to list
            this.clients.add(new Client(name, surname, address, phoneNumber));
        });
    }

    public List<Client> getClients() {
        return this.clients;
    }
    public List<Appointment> getAppointments() {
        return this.appointments;
    }
    public void addAppointment(Appointment appointment, Client client){
        appointment.setOwner(client);
        appointments.add(appointment);
    }

    public List<String> getAppointmentByDate(String date) {
        List<String> appointments = new ArrayList<>();

        this.appointments.forEach(appointment -> {
            if (appointment.getDate().equalsString(date)) {
                appointments.add(appointment.toString());
            }
        });

        return appointments;
    }

    public boolean isClient(Client client) {
        return clients.contains(client);
    }

}
