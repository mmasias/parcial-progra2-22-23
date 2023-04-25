package examen_parcial_p2.src;

import examen_parcial_p2.src.main.ex1.Appointment;
import examen_parcial_p2.src.main.ex1.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Appointment> appointments = new ArrayList<>();
        FileHandler fileHandlerExample = new FileHandler();

        for (String appointment: fileHandlerExample.loadFileContent("examen_pacrial_p2/data/clients.dat")) {
            String[] rawData;
            rawData = appointment.split(",");


            String name;
            name = rawData[0];

            String surname;
            surname = rawData[1];

            String address;
            address = rawData[2];

            String phone;
            phone = rawData[3];
        }
    }
}
