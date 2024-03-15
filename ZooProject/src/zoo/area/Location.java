package zoo.area;

import java.util.Random;

public class Location {
	
	private int x;
	private int y;
	
	public Location() {
		boolean findEmptyPlace = false;
		while(!findEmptyPlace) {
			Random random = new Random();
			int tempX = random.nextInt(500);
			int tempY = random.nextInt(500);
			if(Area.getZoo()[tempX][tempY] == null) {
				setX(tempX);
				setY(tempY);
				findEmptyPlace = true;
			}
		}
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
