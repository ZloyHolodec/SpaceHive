package org.spacehive.world.math;

public class Vector2D {

	private double x, y;

	public Vector2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Vector2D() {
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
