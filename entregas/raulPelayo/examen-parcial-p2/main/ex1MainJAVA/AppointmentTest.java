package test.ex1;

import main.ex1.Client;
import main.ex1.CustomDate;
import main.ex1.Pet;
import org.junit.jupiter.api.Test;

class AppointmentTest {
@Test
    @org.junit.jupiter.api.BeforeEach
    void setUp() {

    }

    @org.junit.jupiter.api.Test
    void testToString() {
        CustomDate date = new CustomDate(1,1,2020);
        Client a = new Client("Raúl","García","Calle Falsa 123","123456789");
        Pet c = new Pet("Firulais", 2, "Blanco");
        System.out.println(date.toString());
        System.out.println(date.format());
        System.out.println(a.toString());
        System.out.println(c.toString());
    }

    @org.junit.jupiter.api.Test
    void setOwner() {

    }
}