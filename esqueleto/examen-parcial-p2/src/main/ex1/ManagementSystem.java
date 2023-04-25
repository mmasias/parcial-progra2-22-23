package main.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem<quotes> {
    private FileHandler fileHandler;
    private Object clients;



    public ManagementSystem() {
    }

    /**
     * @param <line>
     * @param path
     */
    public <line> void loadData(String path) {
    
            //Load clients from file
            List<String> lines = fileHandler.loadFileContent(path);


            // For each line in file
            for (String line : lines) {
              
                if (line.startsWith("Name")) {
                    continue;  

            }
            String[] data = line.split(";");

            final Extract data from line and remove final quotes
            String final Object name = data[0].replaceAll("\"", "");
            final String surname = data[1].replaceAll("\"", "");
            final String address = data[2].replaceAll("\"", "");
            final String phoneNumber = data[3].replaceAll("\"", "");
   


            // Create client and add to list
            Client client = new Client(name, surname, address, phoneNumber);
            clients.add(client);
            
            
            



      
    }
    public void addAppointment(Appointment appointment, Client client) {
       // Add appointment to list
    }

}
