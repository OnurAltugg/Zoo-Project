package zoo.model;

public class Lion extends Animal {
	
	private final static int stepNumber = 4;
	
	public Lion() {
		super();
	}
	
	@Override
	public void move() {
		checkHunt(Lion.class, 5);
		checkCouple(Lion.class);
		getLocation().changeLocation(stepNumber);
	}
	
	@Override
	public int getStepNumber() {
		return stepNumber;
	}
	
	@Override
	protected Lion createNewAnimal() {
		return new Lion();
	}
	@Override
	public String toString() {
		return "Lion: " + super.toString();
	}

}
