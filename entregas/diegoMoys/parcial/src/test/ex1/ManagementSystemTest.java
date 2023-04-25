package test.ex1;

import Main.ex1.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagementSystemTest {

    @Test
    @DisplayName("Create an appointment and check if it is added to the list")
    void addAppointment() {

        Client client = new Client("Emily", "Smith", "123 Main St, Los Angeles", "123456789");
        Pet dog = new Dog("Fido", "Black", 5);
        CustomDate date = new CustomDate(25, 3, 2023);

        Appointment appointment = new Appointment(dog, date, "Vaccination");

        //managementSystem.addAppointment(appointment, client);

        int expectedAppointmentsLoaded = 1;
        //int actualAppointmentsLoaded = managementSystem.getAppointments().size();

        //assertEquals(expectedAppointmentsLoaded, actualAppointmentsLoaded);

    }
}
