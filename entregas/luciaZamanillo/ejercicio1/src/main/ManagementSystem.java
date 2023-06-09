package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;
    List <Client> clients = new ArrayList<Client>();
    List <Appointment> appointments = new ArrayList<Appointment>();

    public ManagementSystem() {
        this.fileHandler = new FileHandler();
    }

    public void loadData(String path) {

        for (String clientString: fileHandler.loadFileContent("src/main/data/clients.dat")) {
            String data[];
            data = clientString.split(";");

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

}
