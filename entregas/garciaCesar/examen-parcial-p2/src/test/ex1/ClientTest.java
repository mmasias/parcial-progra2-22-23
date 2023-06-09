package src.test.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.main.ex1.Client;

class ClientTest {
	@Test
	@DisplayName("Two clients are equal if they have the same name and surname")
	void testEquals() {
		Client client1 = new Client("Emily", "Smith", "Los Angeles", "");
		Client client2 = new Client("Emily", "Smith", "123 Main St, Los Angeles", "123456789");

		Assertions.assertTrue(client1.equals(client2));
	}
}
