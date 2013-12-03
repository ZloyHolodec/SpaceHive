package org.spacehive.world;

import org.spacehive.world.solarsystems.Planet;
import org.spacehive.world.spaceships.BaseSpaceShip;
import org.spacehive.world.spaceships.SpaceShipSize;
import org.spacehive.world.user.User;

public class BaseOnMapObject extends WorldObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected double x, y;
	protected double vx, vy;
	protected final SpaceShipSize onMapSize;
	protected final User user;

	public BaseOnMapObject() {
		onMapSize = new SpaceShipSize();
		user = new User();
	}

	/**
	 * test status if object is dead, we still continue call update method only
	 * if isFree() method return true, update method don't call
	 * 
	 * @see BaseSpaceShip#isFree()
	 * @see BaseSpaceShip#Update()
	 * @return live or dead
	 */
	public boolean isDead() {
		return true;
	}

	/**
	 * if true - we can delete this object, and stop use update method
	 * 
	 * @return free status
	 */
	public boolean isFree() {
		return isDead();
	}

	/**
	 * call every game tick, if isFree() == false
	 * 
	 * @see BaseSpaceShip#isFree()
	 */
	public void Update(Planet planet) {
		setX(getX() + vx);
		setY(getY() + vy);
	}

	public SpaceShipSize getSize() {
		return onMapSize;
	}

	public User getUser() {
		return user;
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
