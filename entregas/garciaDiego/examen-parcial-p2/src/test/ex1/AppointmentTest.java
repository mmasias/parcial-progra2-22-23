package test.ex1;

import main.ex1.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

    @Test
    void testToString() {
        Client client = new Client("Diego", "Garcia", "Calle 1", "123456789");
        Pet pet = new Cat("Firulais", "brown", 2);
        CustomDate date = new CustomDate(10, 10, 2020);
        Appointment appointment = new Appointment(client, pet, date, "Corte de pelo");
        assertEquals("10/10/2020 - Diego Garcia - Firulais - Corte de pelo", appointment.toString());

    }

}