// ManagementSystem

import FileHandler;
import java.util.ArrayList;
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

    public void loadData(String filePath) {
        List<String> lines = fileHandler.loadFileContent(filePath);
        for (String line : lines) {
            String[] clientData = line.split(",");
            Client client = new Client(clientData[0], clientData[1], clientData[2], clientData[3]);
            clients.add(client);
        }
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addAppointment(Appointment appointment, Client client) {
        if (!isClient(client)) {
            clients.add(client);
        }
        appointment.setOwner(client);
        appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    private boolean isClient(Client client) {
        return clients.stream().anyMatch(c -> c.equals(client));
    }
}
