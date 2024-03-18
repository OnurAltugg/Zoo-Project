package zoo.model;

public class Rooster extends Creature {
	
	private final static int stepNumber = 1;
	
	public Rooster() {
	}
	
	public static int getStepnumber() {
		return stepNumber;
	}
	
	@Override
	public String toString() {
		return "Rooster: " + super.toString();
	}

}
