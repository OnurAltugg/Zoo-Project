package zoo.model;

public class Wolf extends Creature {
	
	private final static int stepNumber = 3;
	
	public Wolf() {
		super();
	}

	public static int getStepnumber() {
		return stepNumber;
	}
	
	@Override
	public String toString() {
		return "Wolf: " + super.toString();
	}

}
