package main.ex1.tests;

import main.ex1.core.Client;
import main.ex1.utils.FileHandler;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManageSystemTest {
    @Test
    void loadClients() {
        List<Client> clientList = new ArrayList<>();
        FileHandler fileHandlerExample = new FileHandler();

        for (String client: fileHandlerExample.loadFileContent("src/main/ex1/data/clients.dat")) {
            String[] rawData;
            rawData = client.split(",");

            String name;
            name = rawData[0];

            String surname;
            surname = rawData[1];

            String address;
            address = rawData[2];

            String phoneNumber;
            phoneNumber = rawData[3];

            clientList.add(new Client(name, surname , address, phoneNumber));

        }
        System.out.println(clientList.size());
        int expected = 64 ;
        assertEquals(expected, clientList.size());

    }
}
