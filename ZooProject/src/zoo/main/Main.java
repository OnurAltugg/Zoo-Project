package zoo.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;

import zoo.area.Area;
import zoo.model.*;

public class Main {
	
	public static <T extends Creature> void addAnimals(Class<T> animalType, int numberOfAnimals) {
		Constructor<T> constructor = null;
		try {
			constructor = animalType.getDeclaredConstructor();
		} 
		catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
        for (int i = 1; i <= numberOfAnimals; i++) {
            T animal = null;
			try {
				animal = constructor.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
										| InvocationTargetException e) {
				e.printStackTrace();
			}
            Area.addCreature(animal);
        }
	}

	public static void main(String[] args) {
		addAnimals(Sheep.class, 30);
		addAnimals(Cow.class, 10);
		addAnimals(Chicken.class, 10);
		addAnimals(Wolf.class, 10);
		addAnimals(Rooster.class, 10);
		addAnimals(Lion.class, 8);
		addAnimals(HunterHuman.class, 1);
		
		Collections.shuffle(Area.getCreatures());
		
		for (Creature creature : Area.getCreatures()) {
			System.out.println(creature);
		}
	}

}
