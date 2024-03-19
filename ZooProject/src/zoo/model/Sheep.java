package zoo.model;

public class Sheep extends Animal{
	
	private final static int stepNumber = 2;
	
	public Sheep() {
		super();
	}
	
	@Override
	public void move() {
		checkCouple(Sheep.class);
		getLocation().changeLocation(stepNumber);
	}
	
	@Override
	public int getStepNumber() {
		return stepNumber;
	}
	
	@Override
	protected Sheep createNewAnimal() {
		return new Sheep();
	}
	
	@Override
	public String toString() {
		return "Sheep: " + super.toString();
	}

}
