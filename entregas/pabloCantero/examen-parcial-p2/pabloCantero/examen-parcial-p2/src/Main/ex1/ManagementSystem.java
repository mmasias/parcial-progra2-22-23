package Main.ex1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ManagementSystem {
    private FileHandler fileHandler;
    private ArrayList<Client> clients;
    private ArrayList<Appointment> appointments;


    public ManagementSystem() {
        this.clients = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public void loadData() {
        ArrayList<String> linesClients;
        try {
            linesClients = (ArrayList<String>) readFile.loadData(path);

            for (String line : linesClients) {
                String[] data = line.split(",");
                System.out.println(line);
                String name = data[0].compareTo("\\N") == 0 ? "" : data[0];
                String surname = data[1].compareTo("\\N") == 0 ? "" : data[1];
                String adress = data[2].compareTo("\\N") == 0 ? "" : data[2];
                int phoneNumber = Integer.parseInt(data[3].compareTo("\\N") == 0 ? "" : data[3]);

                Client client = new Client(name, surname, adress, phoneNumber);
                clients.add(client);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void loadData() {
        ArrayList<String> linesAppointments;
        try {
            linesAppointments = (ArrayList<String>) readFile.loadData(path);

            for (String line : linesAppointments) {
                String[] data = line.split(",");
                System.out.println(line);
                String owner = data[0].compareTo("\\N") == 0 ? "" : data[0];
                Pet pet = data[1].compareTo("\\N") == 0 ? "" : data[1];
                CustomDate date = data[2].compareTo("\\N") == 0 ? "" : data[2];
                String description = data[3].compareTo("\\N") == 0 ? "" : data[3];

                Appointment appointment = new Appointment(owner,pet,date,description);
                appointments.add(appointment);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }




    }

