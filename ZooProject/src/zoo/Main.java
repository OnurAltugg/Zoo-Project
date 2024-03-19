package zoo;

import zoo.enums.Gender;
import zoo.management.Zoo;
import zoo.model.*;

/**
 * The {@code Main} class initializes the zoo simulation and runs it.
 * It creates various animals with specified genders and numbers, then starts the simulation.
 * 
 * Note: I increased the number of animals given in the task so that the change in the number of animals is more clearly visible.
 */
public class Main {
	
	public static void main(String[] args) {
		Zoo.createAnimals(Sheep.class, 60, Gender.FEMALE);
		Zoo.createAnimals(Sheep.class, 60, Gender.MALE);
		Zoo.createAnimals(Cow.class, 20, Gender.FEMALE);
		Zoo.createAnimals(Cow.class, 20, Gender.MALE);
		Zoo.createAnimals(Chicken.class, 20, Gender.FEMALE);
		Zoo.createAnimals(Chicken.class, 20, Gender.MALE);
		Zoo.createAnimals(Wolf.class, 20, Gender.FEMALE);
		Zoo.createAnimals(Wolf.class, 20, Gender.MALE);
		Zoo.createAnimals(Rooster.class, 20, Gender.FEMALE);
		Zoo.createAnimals(Rooster.class, 20, Gender.MALE);
		Zoo.createAnimals(Lion.class, 16, Gender.FEMALE);
		Zoo.createAnimals(Lion.class, 16, Gender.MALE);
		Zoo.createAnimals(HunterHuman.class, 1, null);
		
		Zoo.simulation();
	}

}
