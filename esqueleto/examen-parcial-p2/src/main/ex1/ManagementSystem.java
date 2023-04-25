package main.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem extends Main{
    private FileHandler fileHandler;

    public ManagementSystem() {
    }

    public void loadData(String path) {
        ReadFile = readFile = new ReadFile();
        List<String> listClients;
        try{
            listClients = readFile.loadSource("esqueleto/data/clients.dat");

            String name;
            String surname;
            String address;
            String phoneNumber;


            for(String line : listClients){
                System.out.println(line);
                String[] lineData=line.split(",");
                String name = data[0].replaceAll("\"", "");
                String surname = data[1].replaceAll("\"", "");
                String address = data[2].replaceAll("\"", "");
                String phoneNumber = data[3].replaceAll("\"", "");
        } catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }
    }
    public void addAppointment(Appointment appointment, Client client) {
       // Add appointment to list
    }

}
