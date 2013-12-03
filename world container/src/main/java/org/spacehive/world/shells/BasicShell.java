package org.spacehive.world.shells;

import org.spacehive.world.BaseOnMapObject;
import org.spacehive.world.solarsystems.Planet;
import org.spacehive.world.spaceships.BaseSpaceShip;

public class BasicShell extends BaseOnMapObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int liveTime;
	private int damage;
	
	public BasicShell(int liveTime, int damage, double x, double y, double vx, double vy) {
		super();
		this.liveTime = liveTime;
		this.damage = damage;
		this.vx = vx;
		this.vy = vy;
	}

	@Override
	public void Update(Planet planet) {
		super.Update(planet);
		liveTime-= 1;
		for (BaseOnMapObject object: planet.getObjects()) {
			if (object.getClass().getSuperclass() == BaseSpaceShip.class) {
				BaseSpaceShip spaceShip = (BaseSpaceShip)object;
				if (spaceShip.getUser().getId() != this.getUser().getId()) {
					if (planet.isCollide(object, this)) {
						CauseDamage(spaceShip);
					}
				}
			}
		}
	}
	@Override
	public boolean isDead() {
		return liveTime > 0;
	}
	
	public void CauseDamage(BaseSpaceShip spaceShip) {
		if (spaceShip.isDead()) return;
 		spaceShip.Hit(damage);
		liveTime = 0;
	}
}
