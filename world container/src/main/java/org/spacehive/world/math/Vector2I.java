package org.spacehive.world.math;

public class Vector2I {

	private int x, y;

	public Vector2I() {
	}

	public Vector2I(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Vector2I(Vector2D vector2d) {
		super();
		this.x = (int)Math.round(vector2d.getX());
		this.y = (int)Math.round(vector2d.getY());
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
