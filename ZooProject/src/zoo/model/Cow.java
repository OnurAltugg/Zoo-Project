package zoo.model;

import zoo.area.Area;

/**
 * The {@code Cow} class represents a cow in the zoo.
 * It is a subclass of {@link Animal} class and provides methods specific to cows.
 */
public class Cow extends Animal{
	
	/**
     * The number of steps a cow can move in one iteration.
     */
	private final static int stepNumber = 2;
	
	/**
     * Constructs a new cow with a random gender and location.
     */
	public Cow() {
		super();
	}
	
	/**
     * Moves the cow, checks for a mate, and changes its location.
     */
	@Override
	public void move() {
		checkCouple(Cow.class);
		getLocation().changeLocation(stepNumber);
		Area.getZoo()[this.getLocation().getX()][this.getLocation().getY()] = this;
	}
	
	/**
     * Retrieves the number of steps the cow can move in one iteration.
     * 
     * @return the step number
     */
	@Override
	public int getStepNumber() {
		return stepNumber;
	}
	
	/**
     * Creates a new cow as offspring.
     * 
     * @return a new instance of cow
     */
	@Override
	protected Cow createNewAnimal() {
		return new Cow();
	}
	
	/**
     * Returns a string representation of the cow.
     * 
     * @return a string representation of the cow with location and gender
     */
	@Override
	public String toString() {
		return "Cow: " + super.toString();
	}

}
