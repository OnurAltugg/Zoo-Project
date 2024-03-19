package zoo.model;

import zoo.area.Area;

/**
 * The {@code Wolf} class represents a wolf in the zoo.
 * It is a subclass of {@link Animal} class and provides methods specific to wolfs.
 */
public class Wolf extends Animal {
	
	/**
     * The number of steps a wolf can move in one iteration.
     */
	private final static int stepNumber = 3;
	
	/**
     * Constructs a new wolf with a random gender and location.
     */
	public Wolf() {
		super();
	}
	
	/**
     * Moves the chicken, checks for a hunt, checks for a mate, and changes its location.
     */
	@Override
	public void move() {
		checkHunt(Wolf.class, 4);
		checkCouple(Wolf.class);
		getLocation().changeLocation(stepNumber);
		Area.getZoo()[this.getLocation().getX()][this.getLocation().getY()] = this;
	}
	
	/**
     * Retrieves the number of steps the wolf can move in one iteration.
     * 
     * @return the step number
     */
	@Override
	public int getStepNumber() {
		return stepNumber;
	}
	
	/**
     * Creates a new wolf as offspring.
     * 
     * @return a new instance of wolf
     */
	@Override
	protected Wolf createNewAnimal() {
		return new Wolf();
	}
	
	/**
     * Returns a string representation of the wolf.
     * 
     * @return a string representation of the wolf with location and gender
     */
	@Override
	public String toString() {
		return "Wolf: " + super.toString();
	}

}
