package zoo.model;

import zoo.area.Area;

/**
 * The {@code Rooster} class represents a rooster in the zoo.
 * It is a subclass of {@link Animal} class and provides methods specific to roosters.
 */
public class Rooster extends Animal {
	
	/**
     * The number of steps a rooster can move in one iteration.
     */
	private final static int stepNumber = 1;
	
	/**
     * Constructs a new rooster with a random gender and location.
     */
	public Rooster() {
		super();
	}
	
	/**
     * Moves the chicken, checks for a mate, and changes its location.
     */
	@Override
	public void move() {
		checkCouple(Rooster.class);
		getLocation().changeLocation(stepNumber);
		Area.getZoo()[this.getLocation().getX()][this.getLocation().getY()] = this;
	}
	
	/**
     * Retrieves the number of steps the rooster can move in one iteration.
     * 
     * @return the step number
     */
	@Override
	public int getStepNumber() {
		return stepNumber;
	}
	
	/**
     * Creates a new rooster as offspring.
     * 
     * @return a new instance of rooster
     */
	@Override
	protected Rooster createNewAnimal() {
		return new Rooster();
	}
	
	/**
     * Returns a string representation of the rooster.
     * 
     * @return a string representation of the rooster with location and gender
     */
	@Override
	public String toString() {
		return "Rooster: " + super.toString();
	}

}
