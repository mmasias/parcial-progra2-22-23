package main.ex1.tests;

import main.ex1.core.CustomDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomDateTest {
    @Test
    void testToString() {
        CustomDate date = new CustomDate(1, 1, 2021);
        String expected = "1/1/2021";
        assertEquals(expected, date.toString());
    }
    @Test
    void testFormat(){
        CustomDate date = new CustomDate(1, 1, 2021);
        String expected = "[ 1/1/2021 ]";
        assertEquals(expected, date.format());
    }
}
