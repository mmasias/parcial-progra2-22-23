import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r;
    @BeforeEach
    void setUp() {
        r=new Rectangle("blue",true,2,3);
    }

    @Test
    void getArea() {
        assertEquals(6,r.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(10,r.getPerimeter());
    }
}