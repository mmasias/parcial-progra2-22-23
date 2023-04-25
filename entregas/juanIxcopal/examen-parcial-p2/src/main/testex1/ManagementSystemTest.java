package main.ex1;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManagementSystemTest {

    main.ex1.ManagementSystem managementSystem;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        managementSystem = new main.ex1.ManagementSystem();
        managementSystem.loadData("data/clients.dat");
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.DisplayName("Load data from file to check if clients are added to the list")
    void loadClients() {

        int expectedClientsLoaded = 64;
        int actualClientsLoaded = managementSystem.getClients().size();

        assertEquals(expectedClientsLoaded, actualClientsLoaded);

    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.DisplayName("Create an appointment and check if it is added to the list")
    void addAppointment() {

        main.ex1.Client client = new main.ex1.Client("Emily", "Smith", "123 Main St, Los Angeles", "123456789");
        main.ex1.Pet dog = new main.ex1.Dog("Fido", "Black", 5);
        main.ex1.CustomDate date = new main.ex1.CustomDate(25, 3, 2023);

        main.ex1.Appointment appointment = new main.ex1.Appointment(dog, date, "Vaccination");

        managementSystem.addAppointment(appointment, client);

        int expectedAppointmentsLoaded = 1;
        int actualAppointmentsLoaded = managementSystem.getAppointments().size();

        assertEquals(expectedAppointmentsLoaded, actualAppointmentsLoaded);

    }
}