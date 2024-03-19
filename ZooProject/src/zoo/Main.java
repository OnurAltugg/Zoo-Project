package zoo;

import zoo.enums.Gender;
import zoo.management.Zoo;
import zoo.model.*;

public class Main {
	
	public static void main(String[] args) {
		Zoo.createAnimals(Sheep.class, 15, Gender.FEMALE);
		Zoo.createAnimals(Sheep.class, 15, Gender.MALE);
		Zoo.createAnimals(Cow.class, 5, Gender.FEMALE);
		Zoo.createAnimals(Cow.class, 5, Gender.MALE);
		Zoo.createAnimals(Chicken.class, 5, Gender.FEMALE);
		Zoo.createAnimals(Chicken.class, 5, Gender.MALE);
		Zoo.createAnimals(Wolf.class, 5, Gender.FEMALE);
		Zoo.createAnimals(Wolf.class, 5, Gender.MALE);
		Zoo.createAnimals(Rooster.class, 5, Gender.FEMALE);
		Zoo.createAnimals(Rooster.class, 5, Gender.MALE);
		Zoo.createAnimals(Lion.class, 4, Gender.FEMALE);
		Zoo.createAnimals(Lion.class, 4, Gender.MALE);
		Zoo.createAnimals(HunterHuman.class, 1, null);
		
		Zoo.simulation();
	}

}
