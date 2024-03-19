package zoo.model;

public class Cow extends Animal{
	
	private final static int stepNumber = 2;
	
	public Cow() {
		super();
	}

	@Override
	public void move() {
		checkCouple(Cow.class);
		getLocation().changeLocation(stepNumber);
	}
	
	@Override
	public int getStepNumber() {
		return stepNumber;
	}
	
	@Override
	protected Cow createNewAnimal() {
		return new Cow();
	}
	
	@Override
	public String toString() {
		return "Cow: " + super.toString();
	}

}
