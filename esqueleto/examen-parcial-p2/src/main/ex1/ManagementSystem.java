package main.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;



    public ManagementSystem() {
    }

    public void loadData(String path) {
    
            Load clients from file
            List<String> lines = fileHandler.loadFileContent(path);


            // For each line in file
            for (String line : lines) {
              
                if (line.startsWith("Name")) {
                    continue;  

            }
            String[] data = line.split(";");

            Extract data from line and remove quotes
            String name = data[0].replaceAll("\"", "");
            String surname = data[1].replaceAll("\"", "");
            String address = data[2].replaceAll("\"", "");
            String phoneNumber = data[3].replaceAll("\"", "");
   

            
            // Create client and add to list
            Client client = new Client(name, surname, address, phoneNumber);
            this.clients.add(client);



      
    }
    public void addAppointment(Appointment appointment, Client client) {
       // Add appointment to list
    }

}
