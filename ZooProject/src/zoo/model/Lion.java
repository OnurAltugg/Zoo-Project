package zoo.model;

import zoo.area.Location;
import zoo.gender.Gender;

public class Lion implements Hunter {
	
private final static int stepNumber = 4;
	
	private Location location;
	
	private Gender gender;
	
	public Lion() {
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

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "Lion: " + location.toString() + ", Gender=" + gender;
	}

}
