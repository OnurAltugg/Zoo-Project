package zoo.model;

public class HunterHuman extends Creature {
	
	private final static int stepNumber = 1;
		
	public HunterHuman() {
		super();
	}
	
	public static int getStepnumber() {
		return stepNumber;
	}
	
	@Override
	public String toString() {
		return "HunterHuman: " + getLocation().toString();
	}

}
