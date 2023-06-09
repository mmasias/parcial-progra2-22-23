package main.ex2;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Circle c = new Circle(10);
    }



    @org.junit.jupiter.api.Test
    void area() {
        assertEquals(314,314,c.area());
    }

    @org.junit.jupiter.api.Test
    void perimeter() {
        assertEquals(62,314,c.perimeter());

    }

}