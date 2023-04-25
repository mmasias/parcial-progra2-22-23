package entregas.saraPatino.src.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;



    public ManagementSystem() {
    }

    public void loadData(String path) {
        
        FileHandler fileHandlerExample = new FileHandler();
        
        for (String client: fileHandlerExample.loadFileContent("src/main/data/clients.dat")) {
            String[] rawData;
            rawData = client.split(",");

            String name;
            name = rawData[0].toString();

            String surname;
            surname = rawData[1];

            String adress;
            adress = rawData[2];
            
            String phoneNumber;
            phoneNumber = rawData[3];

        }

    }
    public void addAppointment(Appointment appointment, Client client) {
       
    }

}

