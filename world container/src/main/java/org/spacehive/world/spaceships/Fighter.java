package org.spacehive.world.spaceships;

import org.spacehive.world.WorldSettings;
import org.spacehive.world.math.Vector2D;
import org.spacehive.world.math.VectorMath;
import org.spacehive.world.shells.BasicShell;
import org.spacehive.world.solarsystems.Planet;

public class Fighter extends BaseSpaceShip {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// where we shoot point
	private double targetX, targetY;
	// shoot again or not
	private boolean isShoot;

	public Fighter() {
		super();
	}

	@Override
	public void Update(Planet planet) {
		super.Update(planet);
		if (isShoot) {
			VectorMath math = new VectorMath();
			Vector2D vector = math.getDirectionD(x, y, targetX, targetY,
					WorldSettings.BASIC_SHELL_SPEED);
			BasicShell shell = new BasicShell(
					WorldSettings.BASIC_SHELL_LIVE_TIME,
					WorldSettings.BASIC_SHELL_DAMAGE, x, y, vector.getX(),
					vector.getY());
			planet.getObjects().add(shell);
		}
	}

}