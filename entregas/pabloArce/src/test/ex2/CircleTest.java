package test.ex2;

import main.ex2.Circle;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle = new Circle();

    @org.junit.jupiter.api.Test
    void getRadius() {
        double expected = 1.0;
        double gotten = circle.getRadius();
        assertEquals(expected, gotten);
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        double expected = 2.0;
        circle.setRadius(expected);
        double gotten = circle.getRadius();
        assertEquals(expected, gotten);
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        double expected = Math.PI * Math.pow(1, 2);
        circle.setRadius(expected);
        double gotten = circle.getArea();
        assertEquals(expected, gotten);
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        double expected = 2 * Math.PI * 1;
        circle.setRadius(expected);
        double gotten = circle.getPerimeter();
        assertEquals(expected, gotten);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        circle.setColor("red");
        circle.setFilled(false);
        circle.setRadius(1.0);
        String expected = "Circle [Shape [color=red, filled=false], radius=1.0]";
        String gotten = circle.toString();
        assertEquals(expected, gotten);
    }
}