package zoo.model;

import zoo.area.Area;
import zoo.area.Location;
import zoo.enums.Gender;

public abstract class Creature {
	
	private Location location;
	private Gender gender;
	
	public Creature() {
		setGender(Gender.getRandomGender());
		setLocation(new Location());
		Area.getZoo()[getLocation().getX()][getLocation().getY()] = this;
	}
	
	public abstract void move();
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return location.toString() + ", Gender=" + gender;
	}

}
