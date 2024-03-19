package zoo.model;

import zoo.area.Area;

/**
 * The {@code HunterHuman} class represents a hunter human in the zoo.
 * It is a subclass of {@link Animal} class and provides methods specific to hunter human.
 */
public class HunterHuman extends Animal {
	
	/**
     * The number of steps a hunter human can move in one iteration.
     */
	private final static int stepNumber = 1;
	
	/**
     * Constructs a new hunter human with a random gender and location.
     */
	public HunterHuman() {
		super();
	}
	
	/**
     * Moves the hunter human, checks for a hunt, and changes its location.
     */
	@Override
	public void move() {
		checkHunt(HunterHuman.class, 8);
		getLocation().changeLocation(stepNumber);
		Area.getZoo()[this.getLocation().getX()][this.getLocation().getY()] = this;
	}
	
	/**
     * Retrieves the number of steps the hunter human can move in one iteration.
     * 
     * @return the step number
     */
	@Override
	public int getStepNumber() {
		return stepNumber;
	}
	
	/**
     * Creates a new hunter human as offspring. This method is not used in the current implementation.
     * 
     * @return a new instance of chicken
     */
	@Override
	protected HunterHuman createNewAnimal() {
		return new HunterHuman();
	}
	
	/**
     * Returns a string representation of the hunter human.
     * 
     * @return a string representation of the hunter human with location 
     */
	@Override
	public String toString() {
		return "HunterHuman: " + getLocation().toString();
	}

}
