package org.spacehive.world.solarsystems;

import java.util.ArrayList;

import org.spacehive.world.WorldObject;

public class SolarSystem extends WorldObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Planet> planets = new ArrayList<>();
	
	public SolarSystem() {
	}

	public SolarSystem(ArrayList<Planet> planets) {
		super();
		this.planets = planets;
	}
	public ArrayList<Planet> getPlanets() {
		return planets;
	}

	public void setPlanets(ArrayList<Planet> planets) {
		this.planets = planets;
	}
}
