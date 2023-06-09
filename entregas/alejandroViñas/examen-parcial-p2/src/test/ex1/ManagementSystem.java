package test.ex1;

import main.ex1.Appointment;
import main.ex1.Client;
import main.ex1.FileHandler;

import java.util.ArrayList;
import java.util.List;


public class ManagementSystem {

        private FileHandler fileHandler;
        List<main.ex1.Client> clientt = new ArrayList<main.ex1.Client>();
        List<Appointment> appointment = new ArrayList<Appointment>();







        public ManagementSystem() {
                this.fileHandler = new FileHandler();
        }

        public void loadData(String path ) {

                FileHandler fileHandlerExample = new FileHandler();

                for (String line: fileHandlerExample.loadFileContent("src/data/client.dat")) {
                        String[] data = line.split(";");

                        // Extract data from line and remove quotes
                        String name = data[0].replaceAll("\"", "");
                        String surname = data[1].replaceAll("\"", "");
                        String address = data[2].replaceAll("\"", "");
                        String phoneNumber = data[3].replaceAll("\"", "");
                        //Create client and add to list
                        main.ex1.Client client = new Client(name, surname, address, phoneNumber);
                        clientt.add(client);

        }
        public void addAppointment(Appointment appointment, Client clientt) {
                appointment.setOwner(clientt);
                this.appointment.add(appointment);
        }


}
