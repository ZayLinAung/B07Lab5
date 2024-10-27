package B07Lab5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTests {
    @Test
	void testPointNormalDistance() {
		Point p1 = new Point(3, 4);
		Point origin = new Point(0, 0);
		assertEquals(p1.distance(origin), 5);
	}
	
	@Test
	void testPointDuplicate() {
		Point p1 = new Point(-3, 4);
		Point origin = new Point(-3, 4);
		assertEquals(p1.distance(origin), 0);
	}
	
	@Test
	void testPointHashCode() {
		Point p1 = new Point(2.5, 4.56);
		Point p2 = new Point(2.5, 4.56);
		assertEquals(p1.hashCode(), p2.hashCode());
	}
	
	
	@Test
	void testPointEquals() {
		Point p1 = new Point(1.234, 4.234);
		Point p2 = new Point(1.234, 4.234);
		assertTrue(p1.equals(p2));
	}
	
	@Test
	void testPointEqualSelf() {
		Point p = new Point(3, 2);
		assertTrue(p.equals(p));
	}
	
	@Test 
	void testPointEqualNull(){
		Point p = new Point(3, 2);
		assertFalse(p.equals(null));
	}
	
	@Test
	void testPointEqualInstance() {
		Point p1 = new Point(3, 2);
		Point p2 = new Point(5, 2);
		Point p3 = new Point(7, -2);
		Triangle t = new Triangle(p1, p2, p3);
		assertFalse(p1.equals(t));
	}
	
	@Test
	void testPointEqualDiffX() {
		Point p1 = new Point(3, 2);
		Point p2 = new Point(4, 2);
		assertFalse(p1.equals(p2));
	}
	
	@Test
	void testPointEqualDiffY() {
		Point p1 = new Point(3, 2);
		Point p2 = new Point(3, 1);
		assertFalse(p1.equals(p2));
	}

    // Test Cricle
	
	@Test
	void testPerimeter() {
		Circle c = new Circle();
		assertEquals(c.perimeter(), 6.28);
	}


	@Test
	void testPerimeter1() {
		Point p = new Point(1, 1);
		Circle c = new Circle(2, p);
		assertEquals(c.perimeter(), 12.56);
	}
	
	@Test
	void testArea() {
		Circle c = new Circle();
		assertEquals(c.area(), 3.14);
	}
	
	@Test
	void testArea1() {
		Point p = new Point(1, 1);
		Circle c = new Circle(2, p);
		assertEquals(c.area(), 12.56);
	}
}
