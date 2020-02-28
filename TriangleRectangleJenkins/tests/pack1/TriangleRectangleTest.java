package pack1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.triangle.Triangle;
import edu.triangle.TriangleType;
import edu.rectangle.Rectangle;
import edu.rectangle.RectangleType;

public class TriangleRectangleTest {

	public Triangle t1;
	public Triangle t2;
	public Triangle t3;
	public Triangle t4;
	public Triangle t5;
	public Triangle t6;
	public Triangle t7;

	public Rectangle r1;
	public Rectangle r2;
	public Rectangle r3;
	public Rectangle r4;
	public Rectangle r5;
	public Rectangle r6;
	public Rectangle r7;

	@Before
	public void setupTriangle() {
		t1 = new Triangle(3, 4, 5);
		t2 = new Triangle(5, 7, 5);
		t3 = new Triangle(9, 9, 9);
		t4 = new Triangle(0, 0, 0);
		t5 = new Triangle(1, 2, 3);
		t6 = new Triangle(5, 6, 0);
		t7 = new Triangle(7, 7, -1);
	}

	@Before
	public void setupRectangle() {
		r1 = new Rectangle(3, 4, 5, 6);
		r2 = new Rectangle(5, 7, 5, 9);
		r3 = new Rectangle(9, 9, 9, 9);
		r4 = new Rectangle(0, 0, 0, 0);
		r5 = new Rectangle(3, 2, 3, 3);
		r6 = new Rectangle(5, 6, 0, 3);
		r7 = new Rectangle(7, 7, -1, 6);
	}

	@Test
	public void testTriangle() {

		assertEquals(t1.getType(), TriangleType.Rectangle);
		assertEquals(t2.getType(), TriangleType.Isoceles);
		assertEquals(t3.getType(), TriangleType.Equilateral);
		assertEquals(t4.getType(), TriangleType.Invalid);
		assertEquals(t5.getType(), TriangleType.Invalid);
		assertEquals(t6.getType(), TriangleType.Invalid);
		assertEquals(t7.getType(), TriangleType.Invalid);
		// pour un assertTrue, il faut faire une surcharge de equals dans Triangle
	}

	@Test
	public void testRectangle() {

		assertEquals(r1.getType(), RectangleType.Scalene);
		assertEquals(r2.getType(), RectangleType.Rectangle);
		assertEquals(r3.getType(), RectangleType.Carre);
		assertEquals(r4.getType(), RectangleType.Invalid);
		assertEquals(r5.getType(), RectangleType.Rectangle);
		assertEquals(r6.getType(), RectangleType.Invalid);
		assertEquals(r7.getType(), RectangleType.Invalid);
	}

}
