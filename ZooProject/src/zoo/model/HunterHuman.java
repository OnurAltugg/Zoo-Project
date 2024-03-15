package zoo.model;

import zoo.area.Area;
import zoo.area.Location;

public class HunterHuman implements Hunter {
	
	private final static int stepNumber = 1;
	private Location location;
		
	public HunterHuman() {
		setLocation(new Location());
		Area.getZoo()[location.getX()][location.getY()] = this;
	}

	public static int getStepnumber() {
		return stepNumber;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public void couple() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "HunterHuman: " + location.toString();
	}

}
