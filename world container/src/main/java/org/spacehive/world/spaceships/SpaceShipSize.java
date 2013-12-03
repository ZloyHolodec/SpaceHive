package org.spacehive.world.spaceships;

import java.io.Serializable;

public class SpaceShipSize implements Serializable {
	public static final int DEFAULT_W = 8;
	public static final int DEFAULT_H = 8;
	
	public final int width;
	public final int height;
	
	public SpaceShipSize() {
		width = DEFAULT_W;
		height = DEFAULT_H;
	}

	public SpaceShipSize(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

}
