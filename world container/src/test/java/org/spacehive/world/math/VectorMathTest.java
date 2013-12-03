package org.spacehive.world.math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VectorMathTest {

	private VectorMath vectorMath = new VectorMath();
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGetDistance() {
		double dist = vectorMath.getDistance(0, 0, 1, 1);
		assertTrue(Math.sqrt(2) == dist);
	}

	@Test
	public void testGetDirectionD() {
		Vector2D vec = vectorMath.getDirectionD(0, 0, 2, 2, 1);
		double dist = vectorMath.getDistance(0, 0, 2, 2);
		assertTrue(vec.getX()*dist == 2.0d);
		assertTrue(vec.getY()*dist == 2.0d);
	}
}
