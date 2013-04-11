package tests;

import static org.junit.Assert.*;
import ie.gcd.maths.Calc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		
		Calc c=new Calc();
		assertEquals(5,c.add(2, 3));
	}

}
