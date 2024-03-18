package zoo.model;

public class Lion extends Creature {
	
	private final static int stepNumber = 4;
	
	public Lion() {
	}
	
	public static int getStepnumber() {
		return stepNumber;
	}

	@Override
	public String toString() {
		return "Lion: " + super.toString();
	}

}
