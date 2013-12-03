package org.spacehive.world.spaceships;

import org.spacehive.world.BaseOnMapObject;

/**
 * this is base spaceship class, any spaceship type must extend this
 * 
 * @author zloy_holodec
 * 
 */
public class BaseSpaceShip extends BaseOnMapObject {

	/**
	 */
	private static final long serialVersionUID = 1L;
	// health points =)
	private int hullPoints = 10;

	public BaseSpaceShip() {
		super();
	}

	@Override
	public boolean isDead() {
		return hullPoints > 0 ? false : true;
	}

	@Override
	public boolean isFree() {
		return isDead();
	}

	/**
	 * just decrease hullPoints count
	 * 
	 * @param damage
	 *            damage count
	 */
	public void Hit(int damage) {
		hullPoints -= damage;
	}

}
