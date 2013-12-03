package org.spacehive.world.resources;

public class ResourceTypes {

	public static String RESOURCE_HYDROCARBONS = "Hydrocarbons";
	public static String RESOURCE_METALS = "Metals";
	public static String RESOURCE_RAREMETALS = "Rare metals";
	public static String RESOURCE_GAS = "Gas";
	
	public ResourceTypes() {
	}
	
	public static String[] getResTypes() {
		return new String[] { RESOURCE_METALS, RESOURCE_RAREMETALS , RESOURCE_HYDROCARBONS , RESOURCE_GAS }; 
	}

}
