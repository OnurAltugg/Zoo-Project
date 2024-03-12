package zoo.area;

import java.util.Random;

public class Location {
	
	private int x;
	private int y;
	
	public Location() {
		Random random = new Random();
		setX(random.nextInt(500));
		setY(random.nextInt(500));
	}

	public int getX() {
		return x;
	}

	public void setX(int rowPosition) {
		this.x = rowPosition;
	}

	public int getY() {
		return y;
	}

	public void setY(int columnPosition) {
		this.y = columnPosition;
	}

	@Override
	public String toString() {
		return "Location x=" + x + ", y=" + y;
	}
	
}
