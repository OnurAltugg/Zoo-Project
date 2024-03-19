package zoo;

import java.util.Collections;

import zoo.area.Area;
import zoo.management.Zoo;
import zoo.model.*;

public class Main {
	
	public static void main(String[] args) {
		Zoo.createAnimals(Sheep.class, 30);
		Zoo.createAnimals(Cow.class, 10);
		Zoo.createAnimals(Chicken.class, 10);
		Zoo.createAnimals(Wolf.class, 10);
		Zoo.createAnimals(Rooster.class, 10);
		Zoo.createAnimals(Lion.class, 8);
		Zoo.createAnimals(HunterHuman.class, 1);
		
		Collections.shuffle(Area.getCreatures());
		
		Zoo.simulation();
	}

}
