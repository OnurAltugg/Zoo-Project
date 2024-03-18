package zoo.model;

public class Sheep extends Creature{
	
	private final static int stepNumber = 2;
	
	public Sheep() {
		super();
	}
	
	public static int getStepnumber() {
		return stepNumber;
	}
	
	@Override
	public String toString() {
		return "Sheep: " + super.toString();
	}

}
