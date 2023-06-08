package main.ex1.tests;

import main.ex1.core.Appointment;
import main.ex1.core.Client;
import main.ex1.core.CustomDate;
import main.ex1.core.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppointmentTest {

    @Test
    void testToString() {
        Dog dog = new Dog("Firulais", "black", 3);
        CustomDate date = new CustomDate(1, 1, 2021);
        Client client = new Client("Emily", "Smith", "Calle 1", "123456789");
        Appointment appointment = new Appointment( client, dog, date, null);
        String expected = "Appointment{owner=Emily Smith, pet=Firulais, date=[ 1/1/2021 ], description='null'}";


        assertEquals(expected, appointment.toString());
    }


}
