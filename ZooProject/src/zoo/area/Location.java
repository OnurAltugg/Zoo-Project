package zoo.area;

import java.util.Random;

/**
 * The {@code Location} class represents the location of a creature within the zoo area.
 * It provides methods to initialize a random location, change the location, and check the validity of a location.
 */
public class Location {
	
	/**
     * The x-coordinate or row-coordinate of the location.
     */
	private int x;
	
	/**
     * The y-coordinate or column-coordinate of the location.
     */
	private int y;
	
	/**
     * Random number generator.
     */
	Random random = new Random();
	
	/**
     * Constructs a new location with random coordinates within the zoo area.
     * If the location is full, it creates a location with random coordinates again.
     */
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
	
	/**
     * Retrieves the x-coordinate of the location.
     * 
     * @return the x-coordinate
     */
	public int getX() {
		return x;
	}
	
	/**
     * Sets the x-coordinate of the location.
     * 
     * @param rowPosition the x-coordinate to set
     */
	public void setX(int rowPosition) {
		this.x = rowPosition;
	}
	
	/**
     * Retrieves the y-coordinate of the location.
     * 
     * @return the y-coordinate
     */
	public int getY() {
		return y;
	}
	
	/**
     * Sets the y-coordinate of the location.
     * 
     * @param columnPosition the y-coordinate to set
     */
	public void setY(int columnPosition) {
		this.y = columnPosition;
	}
	
	/**
     * Changes the location of the creature by a given creature. 
     * According to the given step, the position can change left, right, up or down, so that their sum is equal to the step.
     * Check if the position obtained is inside the zoo area and if there are any creatures in that position. If there are any problems, the location is recalculated.
     * 
     * @param step the creature stepNumber to move
     */
	public void changeLocation(int step) {
		int negativeStep = -1 * step;
        int stepX = random.nextInt((step - negativeStep) + 1) + negativeStep;
        int stepY = step - (Math.abs(stepX));
        
        if(checkLocation(getX() + stepX, getY() + stepY) && Area.getZoo()[getX() + stepX][getY() + stepY] == null) {
        	Area.getZoo()[getX()][getY()] = null;
        	setX(getX() + stepX);
        	setY(getY() + stepY);
        }
        else {
        	changeLocation(step);
        }
	}
	
	 /**
     * Checks if the specified coordinates are within the boundaries of the zoo area.
     * 
     * @param newX the new x-coordinate to check
     * @param newY the new y-coordinate to check
     * @return {@code true} if the location is valid, {@code false} otherwise
     */
	private boolean checkLocation(int newX, int newY) {
		return newX >= 0 && newX < 500 && newY >= 0 && newY < 500;
	}
	
	/**
     * Returns a string representation of the location.
     * 
     * @return a string representation of the location with x-coordinate and y-coordinate
     */
	@Override
	public String toString() {
		return "Location x=" + x + ", y=" + y;
	}
	
}
