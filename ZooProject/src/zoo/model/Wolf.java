package zoo.model;

public class Wolf extends Animal {
	
	private final static int stepNumber = 3;
	
	public Wolf() {
		super();
	}
	
	@Override
	public void move() {
		checkHunt(Wolf.class, 4);
		checkCouple(Wolf.class);
		getLocation().changeLocation(stepNumber);
	}
	
	@Override
	public int getStepNumber() {
		return stepNumber;
	}
	
	@Override
	protected Wolf createNewAnimal() {
		return new Wolf();
	}
	
	@Override
	public String toString() {
		return "Wolf: " + super.toString();
	}

}
