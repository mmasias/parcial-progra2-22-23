package ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

    @Test
    @DisplayName("Print the appointment in the format: [dd/mm/yyyy] - owner full name - pet name - description")
    void testToString() {
        main.ex1.Pet dog = new main.ex1.Dog("Fido", "Black", 5);
        main.ex1.CustomDate date = new main.ex1.CustomDate(25, 3, 2023);

        main.ex1.Client client = new main.ex1.Client("Emily", "Smith", "123 Main St, Los Angeles", "123456789");

        main.ex1.Appointment appointment = new main.ex1.Appointment(dog, date, "Vaccination");
        appointment.setOwner(client);

        String expectedAppointment = "[25/03/2023] - Emily Smith - Fido - Vaccination";
        String actualAppointment = appointment.toString();

        assertEquals(expectedAppointment, actualAppointment);
    }

}