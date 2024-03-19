package zoo.model;

public class Chicken extends Animal {

	private final static int stepNumber = 1;
	
	public Chicken() {
		super();
	}
	
	@Override
	public void move() {
		checkCouple(Chicken.class);
		getLocation().changeLocation(stepNumber);
	}
	
	@Override
	public int getStepNumber() {
		return stepNumber;
	}
	
	@Override
	protected Chicken createNewAnimal() {
		return new Chicken();
	}
	
	@Override
	public String toString() {
		return "Chicken: " + super.toString();
	}

}
