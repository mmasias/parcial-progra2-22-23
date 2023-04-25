package src.test.ex2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.main.ex2.Shape;

import static org.junit.Assert.assertEquals;

class ShapeTest {
	@Test
	@DisplayName("Print the shape in the format: color - filled")
	void testToString() {
		Shape shape = new Shape("Red", true);
		String expectedShape = "Shape [color=Red, filled=true]";
		String actualShape = shape.toString();
		assertEquals(expectedShape, actualShape);
	}


}
