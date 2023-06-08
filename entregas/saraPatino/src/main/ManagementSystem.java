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

        String name;
        String surname;
        String adress;
        String phoneNumber;
        
        for (String client: fileHandlerExample.loadFileContent("src/main/data/clients.dat")) {
            String[] rawData;
            rawData = client.split(",");

            name = rawData[0].toString();

            surname = rawData[1];

            adress = rawData[2];
            
            phoneNumber = rawData[3];

        }


    }
    public void addAppointment(Appointment appointment, Client client) {
       
    }

}

