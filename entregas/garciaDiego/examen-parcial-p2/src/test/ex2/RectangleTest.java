package test.ex2;

import main.ex2.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle rectangle1 = new Rectangle(5, 3, "red", true);
        int expectedWidth = 5;

        assertEquals(expectedWidth, rectangle1.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle rectangle1 = new Rectangle(5, 3, "red", true);
        rectangle1.setWidth(3);
        int expectedWidth = 3;

        assertEquals(expectedWidth, rectangle1.getWidth());
    }

    @Test
    void getLength() {
        Rectangle rectangle1 = new Rectangle(5, 3, "red", true);
        int expectedLength = 3;

        assertEquals(expectedLength, rectangle1.getLength());
    }

    @Test
    void setLength() {
        Rectangle rectangle1 = new Rectangle(5, 3, "red", true);
        rectangle1.setLength(5);
        int expectedLength = 5;

        assertEquals(expectedLength, rectangle1.getLength());
    }

    @Test
    void getArea() {
        Rectangle rectangle1 = new Rectangle(5, 3, "red", true);
        Double expectedArea = (double) (5 * 3);
        assertEquals(expectedArea, rectangle1.getArea());

    }

    @Test
    void getPerimeter() {
        Rectangle rectangle1 = new Rectangle(5, 3, "red", true);
        Double expectedPerimeter = (double) (2 * (5 + 3));
        assertEquals(expectedPerimeter, rectangle1.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle rectangle1 = new Rectangle(5, 3, "red", true);
        String expectedString = "Rectangle [ Shape [ color = red, filled = true ],width = 5.0, length = 3.0 ]";
        assertEquals(expectedString, rectangle1.toString());
    }
}