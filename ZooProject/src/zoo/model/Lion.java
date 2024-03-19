package zoo.model;

import zoo.area.Area;

/**
 * The {@code Lion} class represents a lion in the zoo.
 * It is a subclass of {@link Animal} class and provides methods specific to lions.
 */
public class Lion extends Animal {
	
	/**
     * The number of steps a lion can move in one iteration.
     */
	private final static int stepNumber = 4;
	
	/**
     * Constructs a new lion with a random gender and location.
     */
	public Lion() {
		super();
	}
	
	/**
     * Moves the lion, checks for a hunt, checks for a mate, and changes its location.
     */
	@Override
	public void move() {
		checkHunt(Lion.class, 5);
		checkCouple(Lion.class);
		getLocation().changeLocation(stepNumber);
		Area.getZoo()[this.getLocation().getX()][this.getLocation().getY()] = this;
	}
	
	/**
     * Retrieves the number of steps the lion can move in one iteration.
     * 
     * @return the step number
     */
	@Override
	public int getStepNumber() {
		return stepNumber;
	}
	
	/**
     * Creates a new lion as offspring.
     * 
     * @return a new instance of lion
     */
	@Override
	protected Lion createNewAnimal() {
		return new Lion();
	}
	
	/**
     * Returns a string representation of the lion.
     * 
     * @return a string representation of the lion with location and gender
     */
	@Override
	public String toString() {
		return "Lion: " + super.toString();
	}

}
