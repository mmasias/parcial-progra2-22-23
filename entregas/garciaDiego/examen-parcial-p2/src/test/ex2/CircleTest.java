package test.ex2;

import main.ex2.Circle;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {


    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle circle1 = new Circle(5, "red", true);
        int expectedRadius = 5;

        assertEquals(expectedRadius, circle1.getRadius());

    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle circle1 = new Circle(3, "red", true);
        circle1.setRadius(5);
        int expectedRadius = 5;

        assertEquals(expectedRadius, circle1.getRadius());
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle circle1 = new Circle(5, "red", true);
        Double expectedArea = Math.PI * Math.pow(5, 2);
        assertEquals(expectedArea, circle1.getArea());
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        Circle circle1 = new Circle(5, "red", true);
        Double expectedPerimeter = 2 * Math.PI * 5;
        assertEquals(expectedPerimeter, circle1.getPerimeter());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Circle circle1 = new Circle(5, "red", true);
        String expectedString = "Circle [ Shape [ color = red, filled = true ], radius = 5.0 ]";
        assertEquals(expectedString, circle1.toString());
    }
}