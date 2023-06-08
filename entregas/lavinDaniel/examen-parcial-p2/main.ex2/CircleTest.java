import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        circle =new Circle("red",true,5.88);
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        assertEquals(108.61868104227493,circle.getArea());
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        assertEquals(36.945129606215964,circle.getPerimeter());
    }
}