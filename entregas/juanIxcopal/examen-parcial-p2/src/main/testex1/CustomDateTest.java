package main.ex1;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomDateTest {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.DisplayName("Display the date in the format dd/mm/yyyy")
    void testToString() {
        CustomDate customDate = new CustomDate(25, 3, 2023);
        String expectedDate = "25/03/2023";
        String actualDate = customDate.toString();

        assertEquals(expectedDate, actualDate);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.DisplayName("Display the date in the format dd-mm-yyyy if the separator is -")
    void format() {
        CustomDate customDate = new CustomDate(25, 3, 2023);
        String expectedFormatedDate = "25-03-2023";
        String actualFormatedDate = customDate.format("-");

        assertEquals(expectedFormatedDate, actualFormatedDate);
    }
}