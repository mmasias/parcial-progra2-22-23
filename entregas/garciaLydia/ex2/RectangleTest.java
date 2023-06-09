package main.ex2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r;

    @BeforeEach
    void setUp() {
        Rectangle r = new Rectangle(12, 6);

    }

    @Test
    void area() {
        assertEquals(72,72,r.getArea());
    }

    @Test
    void perimetro() {
        assertEquals(36,36, r.getPerimeter());
    }
}