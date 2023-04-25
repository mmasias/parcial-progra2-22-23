package main.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem<quotes> {
    private FileHandler fileHandler;
    private Object clients;



    public ManagementSystem() {
        this.fileHandler = new FileHandler();
        this.clients = new ArrayList<Client>();
    }

    /**
     * @param <line>
     * @param path
     */
    public <line> void loadData(String path) {
        List<String> lines = this.fileHandler.loadFileContent(path);
        if (lines == null) {
            return;
        }
        for (String line : lines) {
            String[] data = line.split(",");
            if (data.length != 4) {
                System.err.println("Invalid data");
                continue;
            }
            final Client client = new Client(data[0], data[1], data[2], data[3]);
        }

  
            



      
    }
    public void addAppointment(Appointment appointment, Client client) {
       // Add appointment to list
    }

}
