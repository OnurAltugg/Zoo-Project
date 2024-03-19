package zoo.model;

import zoo.area.Area;

/**
 * The {@code Sheep} class represents a sheep in the zoo.
 * It is a subclass of {@link Animal} class and provides methods specific to sheeps.
 */
public class Sheep extends Animal{
	
	/**
     * The number of steps a sheep can move in one iteration.
     */
	private final static int stepNumber = 2;
	
	/**
     * Constructs a new sheep with a random gender and location.
     */
	public Sheep() {
		super();
	}
	
	/**
     * Moves the sheep, checks for a mate, and changes its location.
     */
	@Override
	public void move() {
		checkCouple(Sheep.class);
		getLocation().changeLocation(stepNumber);
		Area.getZoo()[this.getLocation().getX()][this.getLocation().getY()] = this;
	}
	
	/**
     * Retrieves the number of steps the sheep can move in one iteration.
     * 
     * @return the step number
     */
	@Override
	public int getStepNumber() {
		return stepNumber;
	}
	
	/**
     * Creates a new sheep as offspring.
     * 
     * @return a new instance of sheep
     */
	@Override
	protected Sheep createNewAnimal() {
		return new Sheep();
	}
	
	/**
     * Returns a string representation of the sheep.
     * 
     * @return a string representation of the sheep with location and gender
     */
	@Override
	public String toString() {
		return "Sheep: " + super.toString();
	}

}
