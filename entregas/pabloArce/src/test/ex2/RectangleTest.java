package test.ex2;

import main.ex2.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle = new Rectangle();

    @Test
    void getWidth() {
        double expected = 1.0;
        double gotten = rectangle.getWidth();
        assertEquals(expected, gotten);
    }

    @Test
    void getLength() {
        double expected = 1.0;
        double gotten = rectangle.getLength();
        assertEquals(expected, gotten);
    }

    @Test
    void setWidth() {
        double expected = 2.0;
        rectangle.setWidth(expected);
        double gotten = rectangle.getWidth();
        assertEquals(expected, gotten);
    }

    @Test
    void setLength() {
        double expected = 2.0;
        rectangle.setLength(expected);
        double gotten = rectangle.getLength();
        assertEquals(expected, gotten);
    }

    @Test
    void getArea() {
        double expected = 1*1;
        double gotten = rectangle.getArea();
        assertEquals(expected, gotten);
    }

    @Test
    void getPerimeter() {
        double expected = 2*(1+1);
        double gotten = rectangle.getPerimeter();
        assertEquals(expected, gotten);
    }

    @Test
    void testToString() {
        rectangle.setColor("red");
        rectangle.setFilled(false);
        rectangle.setWidth(1.0);
        rectangle.setLength(1.0);
        String expected = "Rectangle [width=1.0, length=1.0, color=red, filled=false]";
        String gotten = rectangle.toString();
        assertEquals(expected, gotten);
    }
}