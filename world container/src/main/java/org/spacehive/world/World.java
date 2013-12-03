package org.spacehive.world;

import java.io.Serializable;
import java.util.ArrayList;

import org.spacehive.world.solarsystems.Planet;
import org.spacehive.world.solarsystems.SolarSystem;

public class World implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<SolarSystem> solarSystems = new ArrayList<>();
	public World() {}
	
	public void update() {
		for (SolarSystem system: getSolarSystems()) {
			for (Planet planet: system.getPlanets()) {
				for (BaseOnMapObject object: planet.getObjects()) {
					if (object.isFree()) {
						planet.getObjects().remove(object);
					}
					object.Update(planet);
				}
			}
		}
	}

	public ArrayList<SolarSystem> getSolarSystems() {
		return solarSystems;
	}

	public void setSolarSystems(ArrayList<SolarSystem> solarSystems) {
		this.solarSystems = solarSystems;
	}
}
