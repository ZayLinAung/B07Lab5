package B07Lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class rectangleUnitTests {

	
	@Test
	void test1 () {
		Point A = new Point(0,0);
		Point B = new Point(0,1);
		Point C = new Point(1,0);
		Point D = new Point(1,1); 
		Rectangle t1 = new Rectangle(A,B,C,D);
		assertEquals(t1.perimeter(), 4.82842712474619); //Exact number used for accuracy
	}
	@Test
	void test2() {
		Point A = new Point(0,0);
		Point B = new Point(0,1);
		Point C = new Point(1,0);
		Point D = new Point(1,1); 
		Rectangle t2 = new Rectangle(A,B,C,D);
		assertFalse(t2.isEquilateral()); 
	}
	
	@Test
	void test3() {
		Point A = new Point(0,0);
		Point B = new Point(0,0);
		Point C = new Point(0,0);
		Point D = new Point(0,0);
		Rectangle t3 = new Rectangle(A,B,C,D);
		assertTrue(t3.isEquilateral());
	}

}
