package com.zoo.model;

import com.zoo.area.Location;

public class HunterHuman implements Hunter {
	
	private final static int stepNumber = 1;
	
	private Location location;
		
	public HunterHuman() {
		setLocation(new Location());
	}

	public static int getStepnumber() {
		return stepNumber;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public void couple() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

}
