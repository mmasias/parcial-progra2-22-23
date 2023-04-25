package entregas.esparragozaVeronika.src.main.ex1;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;

    public ManagementSystem() {
    }

    public void loadData(String path) {

            //Load clients from file

            // For each line in file

            String[] data = line.split(";");

             // Extract data from line and remove quotes
            String name = data[0].replaceAll("\"", "");
            String surname = data[1].replaceAll("\"", "");
            String address = data[2].replaceAll("\"", "");
            String phoneNumber = data[3].replaceAll("\"", "");


            // Create client and add to list



    }
    public void addAppointment(Appointment appointment, Client client) {
        // Add appointment to list
    }





    //    private FileHandler fileHandler;
 //   private List<Client> clients;
    //private List<Appointment> appointments;

    //public void String loadData() {
        // ...
   // }
}
