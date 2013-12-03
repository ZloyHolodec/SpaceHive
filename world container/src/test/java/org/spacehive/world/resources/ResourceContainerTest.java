package org.spacehive.world.resources;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ResourceContainerTest {

	private ResourceContainer container;
	//minimum 2
	private final int MAX_RES = 100;
	private final String RES = ResourceTypes.RESOURCE_GAS;
	
	@Before
	public void setUp() throws Exception {
		this.container = new ResourceContainer();
		container.setResourceMax(RES, MAX_RES);
	}
	
	private void checkForSetRes(int setCount, int awaitingCount) {
		container.setResourceCount(RES, setCount);
		assertTrue(awaitingCount == container.getResourceCount(RES));
	}
	private void checkForAddRes(int add, int awaitingCount) {
		container.addResource(RES, add);
		assertTrue(awaitingCount == container.getResourceCount(RES));
	}

	@Test
	public void testSetResourceCount() {
		checkForSetRes(MAX_RES+10, MAX_RES);
		checkForSetRes(-10, 0);
		checkForSetRes(MAX_RES-1, MAX_RES-1);
	}

	@Test
	public void testAddResource() {
		container.setResourceCount(RES, MAX_RES);
		checkForAddRes(2, MAX_RES);
		checkForAddRes(-2, MAX_RES-2);
		checkForAddRes(-MAX_RES, 0);
	}

	@Test
	public void testSetMax() {
		assertTrue(container.getResourceMax(RES) == MAX_RES);
	}
}
