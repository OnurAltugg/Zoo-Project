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
		int finishRow = Math.min(currentRow + maxDistance, 500);
		int finishColumn = Math.min(currentColumn + maxDistance, 500);
		
		for(int x = startRow; x < finishRow; x++) {
			for(int y = startColumn; y < finishColumn; y++) {
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
		int finishRow = Math.min(currentRow + maxDistance, 500);
		int finishColumn = Math.min(currentColumn + maxDistance, 500);
		
	    for (int x = startRow; x < finishRow; x++) {
	        for (int y = startColumn; y < finishColumn; y++) {
	            if (Math.abs(currentRow - x) + Math.abs(currentColumn - y) <= maxDistance) {
	                if (animal.isInstance(Wolf.class)) {
	                    if (Area.getZoo()[x][y] instanceof Sheep || 
	                        Area.getZoo()[x][y] instanceof Chicken || 
	                        Area.getZoo()[x][y] instanceof Rooster) {
	                    	Area.removeCreature(Area.getZoo()[x][y]);
	                        Area.getZoo()[x][y] = null;
	                        return;
	                    }
	                } 
	                else if (animal.isInstance(Lion.class)) {
	                    if (Area.getZoo()[x][y] instanceof Cow || 
	                        Area.getZoo()[x][y] instanceof Sheep) {
	                    	Area.removeCreature(Area.getZoo()[x][y]);
	                    	Area.getZoo()[x][y] = null;
	                        return;
	                    }
	                }
	                else if (animal.isInstance(HunterHuman.class)) {
	                	Area.removeCreature(Area.getZoo()[x][y]);
	                	Area.getZoo()[x][y] = null;
                        return;
	                }
	                else {
	                	continue;
	                }
	            }
	        }
	    }
	}
}
