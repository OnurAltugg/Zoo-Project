package zoo.model;

public class Rooster extends Animal {
	
	private final static int stepNumber = 1;
	
	public Rooster() {}
	
	@Override
	public void move() {
		checkCouple(Rooster.class);
		getLocation().changeLocation(stepNumber);
	}
	
	@Override
	public int getStepNumber() {
		return stepNumber;
	}
	
	@Override
	protected Rooster createNewAnimal() {
		return new Rooster();
	}
	
	@Override
	public String toString() {
		return "Rooster: " + super.toString();
	}

}
