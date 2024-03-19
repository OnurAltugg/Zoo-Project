package zoo.model;

import zoo.area.Area;

/**
 * The {@code Chicken} class represents a chicken in the zoo.
 * It is a subclass of {@link Animal} class and provides methods specific to chickens.
 */
public class Chicken extends Animal {
	
	/**
     * The number of steps a chicken can move in one iteration.
     */
	private final static int stepNumber = 1;
	
	/**
     * Constructs a new chicken with a random gender and location.
     */
	public Chicken() {
		super();
	}
	
	/**
     * Moves the chicken, checks for a mate, and changes its location.
     */
	@Override
	public void move() {
		checkCouple(Chicken.class);
		getLocation().changeLocation(stepNumber);
		Area.getZoo()[this.getLocation().getX()][this.getLocation().getY()] = this;
	}
	
	/**
     * Retrieves the number of steps the chicken can move in one iteration.
     * 
     * @return the step number
     */
	@Override
	public int getStepNumber() {
		return stepNumber;
	}
	
	/**
     * Creates a new chicken as offspring.
     * 
     * @return a new instance of chicken
     */
	@Override
	protected Chicken createNewAnimal() {
		return new Chicken();
	}
	
	/**
     * Returns a string representation of the chicken.
     * 
     * @return a string representation of the chicken with location and gender
     */
	@Override
	public String toString() {
		return "Chicken: " + super.toString();
	}

}
