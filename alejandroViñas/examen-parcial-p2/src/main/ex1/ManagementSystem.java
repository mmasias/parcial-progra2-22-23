package main.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.*;


public class ManagementSystem {

        private FileHandler fileHandler;
        List<Client> clientt = new ArrayList<Client>();
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
                        Client client = new Client(name, surname, address, phoneNumber);
                        clientt.add(client);

        }
        //public void addAppointment(Appointment appointment, Client client) {
          //      appointment.setOwner(client);
            //    this.appointment.add(appointment);
        //}




    }
}
