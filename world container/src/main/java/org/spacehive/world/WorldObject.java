package org.spacehive.world;

import java.io.Serializable;

public class WorldObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public WorldObject() {
	}
	/**
	 * YOU MUST DOC THIS!!!
	 * @param object
	 */
	public WorldObject(WorldObject object) {
		setId(object.getId());
	}
}
