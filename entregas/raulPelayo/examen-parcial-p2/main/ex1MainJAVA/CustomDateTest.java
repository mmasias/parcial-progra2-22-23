package test.ex1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.Format;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CustomDateTest {
    @Test

    @BeforeEach
    void setUp() {
        Date a = new Date(2020, 6, 4);
        Date b= new Date(2012, 1, 6);

    }

    @Test
    void testToString() {


    }

    @Test
    void format() {
    }
}