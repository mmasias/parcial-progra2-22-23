package test.ex2;

import main.ex2.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square square = new Square("red", true, 5);
        int expectedSide = 5;

        assertEquals(expectedSide, square.getSide());
    }

    @Test
    void setSide() {
        Square square = new Square("red", true, 5);
        square.setSide(3);
        int expectedSide = 3;

        assertEquals(expectedSide, square.getSide());
    }

    @Test
    void setLength() {
        Square square = new Square("red", true, 5);
        square.setLength(3);
        int expectedLength = 3;

        assertEquals(expectedLength, square.getLength());
    }

    @Test
    void testToString() {
        Square square = new Square("red", true, 5);
        String expectedString = "Square [ Rectangle [ Shape [ color = red, filled = true ],width = 5.0, length = 5.0 ] ]";
        assertEquals(expectedString, square.toString());
    }
}