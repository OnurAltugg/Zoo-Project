package zoo.model;

public class Chicken extends Creature {

	private final static int stepNumber = 1;
	
	public Chicken() {
		super();
	}
	
	public static int getStepnumber() {
		return stepNumber;
	}
	
	@Override
	public String toString() {
		return "Chicken: " + super.toString();
	}

}
