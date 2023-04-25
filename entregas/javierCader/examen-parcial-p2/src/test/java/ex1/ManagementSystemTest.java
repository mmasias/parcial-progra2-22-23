package ex1;

import ex1.Core.Appointment;
import ex1.Utils.Client.Client;
import ex1.Utils.CustomDate.CustomDate;
import ex1.Utils.Pets.Dog;
import ex1.Utils.Pets.Pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagementSystemTest {

    ManagementSystem managementSystem;

    @BeforeEach
    void setUp() {
        managementSystem = new ManagementSystem();
        managementSystem.loadData("data/clients.dat");
    }

    @Test
    @DisplayName("Load data from file to check if clients are added to the list")
    void loadClients() {

        int expectedClientsLoaded = 65;
        int actualClientsLoaded = managementSystem.getClients().size();

        assertEquals(expectedClientsLoaded, actualClientsLoaded);

    }

    @Test
    @DisplayName("Create an appointment and check if it is added to the list")
    void addAppointment() {

        Client client = new Client("Emily", "Smith", "123 Main St, Los Angeles", "123456789");
        Pet dog = new Dog("Fido", "Black", 5);
        CustomDate date = new CustomDate(25, 3, 2023);

        Appointment appointment = new Appointment(dog, date, "Vaccination");

        managementSystem.addAppointment(appointment, client);

        int expectedAppointmentsLoaded = 1;
        int actualAppointmentsLoaded = managementSystem.getAppointments().size();

        assertEquals(expectedAppointmentsLoaded, actualAppointmentsLoaded);

    }

    @Test
    @DisplayName("Get Appointments by date")
    void getAppointmentsByDate() {

        Client client = new Client("Emily", "Smith", "123 Main St, Los Angeles", "123456789");
        Pet dog = new Dog("Fido", "Black", 5);
        CustomDate date = new CustomDate(25, 3, 2023);

        Appointment appointment = new Appointment(dog, date, "Vaccination");

        managementSystem.addAppointment(appointment, client);

        String expectedAppointment = "[25/3/2023] - Emily Smith - Fido - Vaccination";
        String actualAppointment = managementSystem.getAppointmentByDate("25/3/2023").get(0);

        assertEquals(expectedAppointment, actualAppointment);
    }
}