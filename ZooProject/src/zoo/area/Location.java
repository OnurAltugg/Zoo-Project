package zoo.area;

import java.util.Random;

public class Location {
	
	private int x;
	private int y;
	Random random = new Random();
	
	public Location() {
		boolean findEmptyPlace = false;
		while(!findEmptyPlace) {
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
	
	public void changeLocation(int step) {
		int negativeStep = -1 * step;
        int newX = random.nextInt((step - negativeStep) + 1) + negativeStep;
        int newY = step - (Math.abs(newX));
        if(checkLocation(getX() + newX, getY() + newY)) {
        	Area.getZoo()[getX()][getY()] = null;
        	setX(getX() + newX);
        	setY(getY() + newY);
        }
        else {
        	changeLocation(step);
        }
	}

	private boolean checkLocation(int newX, int newY) {
		return newX >= 0 && newX < 500 && newY >= 0 && newY < 500;
	}

	@Override
	public String toString() {
		return "Location x=" + x + ", y=" + y;
	}
	
}
