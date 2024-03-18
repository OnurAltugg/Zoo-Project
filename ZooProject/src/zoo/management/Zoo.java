package zoo.management;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import zoo.area.Area;
import zoo.model.Creature;

public class Zoo {
	
	public static <T extends Creature> void createAnimals(Class<T> animalType, int numberOfAnimals) {
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

}
