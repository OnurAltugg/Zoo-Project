package zoo.model;

public class Cow extends Creature{
	
	private final static int stepNumber = 2;
	
	public Cow() {
		super();
	}

	public static int getStepnumber() {
		return stepNumber;
	}
	
	@Override
	public String toString() {
		return "Cow: " + super.toString();
	}

}
