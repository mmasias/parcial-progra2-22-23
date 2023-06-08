package test.ex1;

import main.ex1.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {


    @BeforeEach
    void setUp() {
    }

    @Test
    void getFullName() {

    }

    @Test
    void testEquals() {
        Client a = new Client("Raúl","García","Calle Falsa 123","123456789");
        assertTrue(a.equals(a));
    }
}