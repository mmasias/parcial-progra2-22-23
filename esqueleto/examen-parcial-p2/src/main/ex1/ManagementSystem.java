package main.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.Client;
import test.Appointment;

public class ManagementSystem {
    private FileHandler fileHandler;



    public ManagementSystem() {
    }

    public void loadData(String path) {
        /*
            Load clients from file

            // For each line in file

            String[] data = line.split(";");

             // Extract data from line and remove quotes
            String name = data[0].replaceAll("\"", "");
            String surname = data[1].replaceAll("\"", "");
            String address = data[2].replaceAll("\"", "");
            String phoneNumber = data[3].replaceAll("\"", "");


            // Create client and add to list

         */
    }
    public void addAppointment(Appointment appointment, Client client) {
       // Add appointment to list
    }

    public Object getAppointments() {
        return null;
    }

    public Object getClients() {
        return null;
    }

}
