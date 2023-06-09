package examen_parcial_p2.src;

import examen_parcial_p2.src.main.ex1.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

            String phoneNumber;
            phoneNumber = rawData[3];

            appointments.add(new Appointment(name, surname, address, phoneNumber));
        }

        Scanner scanner = new Scanner(System.in);
        String nextAppointment = scanner.nextLine();
        printAppointments(nextAppointment, appointments);
    }

    public static void printAppointments(String nextAppointment, List<Appointment> appointments){
        for (Appointment appointment: appointments){
            if (appointment.name().equals(nextAppointment)){
                System.out.println(appointment);
            }
        }
    }
}
