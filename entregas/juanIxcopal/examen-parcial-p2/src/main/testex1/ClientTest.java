package main.ex1;

import static org.junit.Assert.assertTrue;

class ClientTest {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.DisplayName("Two clients are equal if they have the same name and surname")
    void testEquals() {
        Client client1 = new Client("Emily", "Smith", "Los Angeles", "");
        Client client2 = new Client("Emily", "Smith", "123 Main St, Los Angeles", "123456789");

        assertTrue(client1.equals(client2));
    }


}