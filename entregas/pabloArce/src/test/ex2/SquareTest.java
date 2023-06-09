package test.ex2;

import main.ex2.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square = new Square();
    @Test
    void getSide() {
        double expected = 1.0;
        double gotten = square.getSide();
        assertEquals(expected, gotten);
    }

    @Test
    void setSide() {
        double expected = 2.0;
        square.setSide(expected);
        double gotten = square.getSide();
        assertEquals(expected, gotten);
    }

    @Test
    void testToString() {
        square.setColor("red");
        square.setFilled(false);
        square.setSide(1.0);
        String expected = "Square [ Rectangle [ Shape [ color =red, filled=false], width=1.0, length=1.0]]";
        String gotten = square.toString();
        assertEquals(expected, gotten);
    }
}