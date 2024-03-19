package zoo.model;

public class HunterHuman extends Animal {
	
	private final static int stepNumber = 1;
		
	public HunterHuman() {
		super();
	}
	
	public static int getStepnumber() {
		return stepNumber;
	}
	
	@Override
	public void move() {
		checkHunt(HunterHuman.class, 8);
		getLocation().changeLocation(stepNumber);
	}
	
	@Override
	protected HunterHuman createNewAnimal() {
		return new HunterHuman();
	}
	
	@Override
	public String toString() {
		return "HunterHuman: " + getLocation().toString();
	}

}
