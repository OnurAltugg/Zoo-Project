package com.zoo.model;

import com.zoo.area.Location;
import com.zoo.gender.Gender;

public class Sheep implements Creature{
	
	private final static int stepNumber = 2;
	
	private Location location;
	
	private Gender gender;
	
	public Sheep() {
		setGender(Gender.getRandomGender());
		setLocation(new Location());
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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
	
}