import static org.junit.Assert.*;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		Triangle notTriangle = new Triangle(1, 2, 3);
		Triangle regularTriangle = new Triangle(1, 1, 1);
		Triangle scaleneTriangle = new Triangle(3, 4, 5);
		Triangle isoscelesTriangle = new Triangle(3, 3, 1);
		assertEquals(false, notTriangle.isTriangle(notTriangle));
		assertEquals(true, regularTriangle.isTriangle(regularTriangle));
		assertEquals(true, scaleneTriangle.isTriangle(scaleneTriangle));
		assertEquals(true, isoscelesTriangle.isTriangle(isoscelesTriangle));
		assertEquals("Illegal", notTriangle.getType(notTriangle));
		assertEquals("Regular", regularTriangle.getType(regularTriangle));
		assertEquals("Scalene", scaleneTriangle.getType(scaleneTriangle));
		assertEquals("Isosceles", isoscelesTriangle.getType(isoscelesTriangle));
		assertEquals(1, notTriangle.diffOfBorders(1, 2));
		assertEquals(1, notTriangle.diffOfBorders(2, 1));
		long[] borders = new long[]{1,2,3};
		assertArrayEquals(borders, notTriangle.getBorders());
	}

}
