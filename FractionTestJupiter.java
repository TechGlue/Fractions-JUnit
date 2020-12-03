package fraction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FractionTestJupiter {
	Fraction test;
	
	@BeforeEach
	public void setUp() throws Exception{
		test = new Fraction(-16,-20);
	}//end of setUp
	
	@Test
	public void testNumAndDen() {
		Fraction f1 = new Fraction(4,5);
		Fraction f2 = new Fraction(-1,2);
		Fraction f3 = new Fraction(-4,-5);
		assertEquals(4, f1.getNum());
		assertEquals(-1, f2.getNum());
		assertEquals(5, f1.getNum());
		assertEquals(2, f2.getNum());
		assertEquals(4, f3.getNum());
		assertEquals(5, f3.getNum());
	}//end of testNumAndDen
	
	@Test 
	public void testNegatives() {
		assertEquals(4, test.getNum());
		assertEquals(5, test.getNum());
		test = new Fraction(4, -5);
		assertEquals(-4, test.getNum());
		assertEquals(5, test.getNum());
	}//end of testNegatives
	
	@Test
	public void testProperReduction() {
		assertEquals(4, test.getNum());
		assertEquals(5, test.getNum());
		test = new Fraction(121, 11);
		assertEquals(11, test.getNum());
		assertEquals(1, test.getNum());
	}//end of testProperReduction
	
	@Test
	public void testEquals() {
		assertFalse(test.equals(new Fraction(41,50)));
		assertTrue(test.equals(new Fraction(4000,5000)));
	}//end of testEquals
	
	@Test
	public void testCompareTo() {
		assertEquals(2, test.compareTo(new Fraction(2,3)));
		assertEquals(-1, test.compareTo(new Fraction(5,6)));
		assertEquals(0, test.compareTo(new Fraction(40,50)));
	}//end of testCompareTo
	
	@Test
	public void testAdd() {
		test = test.add(new Fraction(4,5));
		assertEquals(8, test.getNum());
		assertEquals(5, test.getDen());
		test = test.add(new Fraction(0,5));
		assertEquals(8, test.getNum());
		assertEquals(5, test.getDen());
	}//end of testAdd
	
	@Test
	public void testMultiplication() {
		test = test.multiply(new Fraction(1,-2));
		assertEquals(-2, test.getNum());
		assertEquals(5, test.getDen());
		test = test.multiply(new Fraction(0,1));
		assertEquals(0, test.getNum());
		assertEquals(1, test.getDen());
	}//end of testMultiplication
	
	@Test
	public void testToString() {
		assertEquals("4/5", test.toString());
		test = new Fraction(-2,5);
		assertEquals("-2/5", test.toString());
		test = new Fraction(2,-5);
		assertEquals("-2/5", test.toString());
		test = new Fraction(-2,-5);
		assertEquals("2/5", test.toString());
	}//end of testToString
	
	@Test
	public void testRealNum() {
		double dtest = test.realValue();
		assertEquals(0.80, dtest);
	}//end of testRealNum
}
