package main.ex1.tests;

import main.ex1.core.Client;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientTest {
    @Test
    void testEquals(){
        Client client1 = new Client("Emily", "Smith", "Calle 1", "123456789");
        Client client2 = new Client("Emily", "Smith", "Calle 2", "2222222222");
        boolean expected = true;
        assertEquals(expected, client2.equals(client1));
    }
}
