package zoo.model;

import zoo.area.Area;

/**
 * The {@code Animal} class represents an animal within the zoo.
 * It is an abstract subclass of {@link Creature} class and provides methods for animal interactions such as finding a mate or hunting.
 */
public abstract class Animal extends Creature{
	
	/**
     * Creates a new animal of the same type.
     * 
     * @return a new instance of the animal
     */
	protected abstract Animal createNewAnimal();
	
	/**
     * Determine the coordinates to be scanned for animals looking for a mate.
     * MaxDistance check of the area to be scanned is performed.
     * If animals are found in the scanned area, it is checked whether they are of the same species and different gender.
     * If the conditions are right, an animal of the same species will form in a random location and gender.  
     * 
     * @param animal the class of the Creature
     */
	protected void checkCouple(Class<?> animal) {
		int currentRow = getLocation().getX();
		int currentColumn = getLocation().getY();
		int maxDistance = 3;
		
		int startRow = Math.max(Math.abs(currentRow - maxDistance), 0); 
		int startColumn = Math.max(Math.abs(currentColumn - maxDistance), 0);
		int finishRow = Math.min(currentRow + maxDistance, 499);
		int finishColumn = Math.min(currentColumn + maxDistance, 499);
		
		for(int x = startRow; x <= finishRow; x++) {
			for(int y = startColumn; y <= finishColumn; y++) {
				if(
						Math.abs(currentRow - x) + Math.abs(currentColumn - y) <= maxDistance 
						&& animal.isInstance(Area.getZoo()[x][y])
						&& getGender() != Area.getZoo()[x][y].getGender()) {
					Area.addCreature(createNewAnimal());
					return;
				}
				else {
					continue;
				}
			}
		}
	}
	
	/**
     * Determine the coordinates to be scanned for animals looking for a hunt.
     * The animal-specific MaxDistance check of the area to be scanned is performed and it is checked whether there is an animal in the specified x,y coordinates.
     * If the condition is met, the animal and the types of animals it can hunt are checked.
     * If an animal is hunted, it is removed from the list and zoo area.
     * 
     * @param animal the class of the Creature
     * @param maxDistance the an animal maximum distance to search for prey
     */
	protected void checkHunt(Class<?> animal, int maxDistance) {
	    int currentRow = getLocation().getX();
	    int currentColumn = getLocation().getY();
	    
	    int startRow = Math.max(Math.abs(currentRow - maxDistance), 0); 
		int startColumn = Math.max(Math.abs(currentColumn - maxDistance), 0);
		int finishRow = Math.min(currentRow + maxDistance, 499);
		int finishColumn = Math.min(currentColumn + maxDistance, 499);
		
	    for (int x = startRow; x <= finishRow; x++) {
	        for (int y = startColumn; y <= finishColumn; y++) {
	        	if ((Math.abs(currentRow - x) + Math.abs(currentColumn - y) <= maxDistance) && Area.getZoo()[x][y] != null) {
	                Creature currentCreature = Area.getZoo()[x][y];
	                if (animal == Wolf.class && (currentCreature instanceof Sheep || currentCreature instanceof Chicken || currentCreature instanceof Rooster)) {
	                	Area.removeCreature(currentCreature);
	                    Area.getZoo()[x][y] = null;
	                    return;
	                } 
	                else if (animal == Lion.class && (currentCreature instanceof Cow || currentCreature instanceof Sheep)) {
	                	Area.removeCreature(currentCreature);
	                    Area.getZoo()[x][y] = null;
	                    return;
	                } 
	                else if (animal == HunterHuman.class && !(currentCreature instanceof HunterHuman) ) {
	                	Area.removeCreature(currentCreature);
	                    Area.getZoo()[x][y] = null;
	                    return;
	                }
	            }
	        }
	    }
	}
}
