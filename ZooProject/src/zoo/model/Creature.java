package zoo.model;

import zoo.area.Area;
import zoo.area.Location;
import zoo.enums.Gender;

/**
 * The {@code Creature} class represents a creature in the zoo.
 * It is an abstract class that provides methods and fields common to all creatures.
 */
public abstract class Creature {
	
	/**
     * The location of the creature within the zoo area.
     */
	private Location location;
	
	/**
     * The gender of the creature.
     */
	private Gender gender;
	
	/**
     * Constructs a new creature with a random gender and a random location within the zoo area.
     */
	public Creature() {
		setGender(Gender.getRandomGender());
		setLocation(new Location());
		Area.getZoo()[getLocation().getX()][getLocation().getY()] = this;
	}
	
	/**
     * Abstract method to be implemented by subclasses for moving the creature.
     */
	public abstract void move();
	
	/**
     * Abstract method to be implemented by subclasses for retrieving the step number for the creature's movement.
     * 
     * @return the step number for movement
     */
	public abstract int getStepNumber();
	
	/**
     * Retrieves the location of the creature within the zoo area.
     * 
     * @return the location of the creature
     */
	public Location getLocation() {
		return location;
	}
	
	/**
     * Sets the location of the creature within the zoo area.
     * 
     * @param location the location to set
     */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
     * Retrieves the gender of the creature.
     * 
     * @return the gender of the creature
     */
	public Gender getGender() {
		return gender;
	}
	
	/**
     * Sets the gender of the creature.
     * 
     * @param gender the gender to set
     */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	/**
     * Returns a string representation of the creature, including its location and gender.
     * This method is only used for testing, not used in the current implementation.
     * 
     * @return a string representation of the creature
     */
	@Override
	public String toString() {
		return location.toString() + ", Gender=" + gender;
	}

}
