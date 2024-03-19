package zoo.model;

import zoo.area.Area;

public abstract class Animal extends Creature{
	
	protected abstract Animal createNewAnimal();
	
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
