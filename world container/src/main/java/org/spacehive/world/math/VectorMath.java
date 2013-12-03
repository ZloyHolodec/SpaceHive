package org.spacehive.world.math;

public class VectorMath {

	public VectorMath() {
	}

	public double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2) );
	}
	
	public Vector2D getDirectionD(double x1, double y1, double x2, double y2, double length) {
		double distance = getDistance(x1, y1, x2, y2);
		if (distance == 0) return new Vector2D(0.0, 0.0);
		
		double vx = Math.abs(x1-x2) / distance;
		double vy = Math.abs(y1-y2) / distance;
		return new Vector2D(vx*length, vy*length);
	}
	
	public Vector2I getDirectionI(double x1, double y1, double x2, double y2, double length) {
		Vector2D vec = getDirectionD(x1, y1, x2, y2, length);
		return new Vector2I(vec);
	}
}
