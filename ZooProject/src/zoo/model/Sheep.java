package zoo.model;

public class Sheep extends Animal{
	
	private final static int stepNumber = 2;
	
	public Sheep() {
		super();
	}
	
	public static int getStepnumber() {
		return stepNumber;
	}
	
	@Override
	public void move() {
		checkCouple(Sheep.class);
		getLocation().changeLocation(stepNumber);
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
