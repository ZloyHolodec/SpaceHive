package org.spacehive.world.solarsystems;

import java.util.ArrayList;

import org.spacehive.world.BaseOnMapObject;
import org.spacehive.world.WorldObject;

public class Planet extends WorldObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ArrayList<BaseOnMapObject> objects = new ArrayList<>();
	public ArrayList<BaseOnMapObject> getObjects() {
		return objects;
	}
	public void setObjects(ArrayList<BaseOnMapObject> objects) {
		this.objects = objects;
	}
	
	/**
	 * test collide between 2 on map objects
	 * NOT REALIZED YET!!!
	 * @param obj1
	 * @param obj2
	 * @return is collide
	 */
	public boolean isCollide(BaseOnMapObject obj1, BaseOnMapObject obj2) {
		return false;
	}
	
	public Planet() {
	}
}
