package main.fr.ut2j.m1ice.ootesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMyPoint {

	MyPoint a;
	MyPoint b;
	
	
	@Before
	public void setUp() throws Exception {
		a= new MyPoint();
		b= new MyPoint(11,10);
	}

	@Test
	public void testConst1() {
		assertEquals(0d,a.getX(),0.0001);
		assertEquals(0d,a.getY(),0.0001);
	}
	
	@Test
	public void testConst2() {
		assertEquals(11d,b.getX(),0.0001);
		assertEquals(10d,b.getY(),0.0001);
	}


}
