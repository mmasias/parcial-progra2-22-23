package test.ex1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppointmentTest {

        @Test
        public void createAppointment() {
            Appointment appointment1 = new Appointment("Paula", "Lola", "2021/01/01", "10:00");
        }

}
