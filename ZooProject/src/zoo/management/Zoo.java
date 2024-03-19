package zoo.management;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import zoo.area.Area;
import zoo.enums.Gender;
import zoo.model.Creature;

public class Zoo {
	
	public static <T extends Creature> void createAnimals(Class<T> animalType, int numberOfAnimals, Gender gender) {
	    Constructor<T> constructor = null;
	    try {
	        constructor = animalType.getDeclaredConstructor();
	    } catch (NoSuchMethodException | SecurityException e) {
	        e.printStackTrace();
	    }

	    for (int i = 1; i <= numberOfAnimals; i++) {
	        T animal = null;
	        try {
	            animal = constructor.newInstance();
	            animal.setGender(gender); 
	        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
	                | InvocationTargetException e) {
	            e.printStackTrace();
	        }
	        Area.addCreature(animal);
	    }
	}
	
	public static void simulation() {
		int stepNumber = 0;
		while(stepNumber < 1000) {
			Collections.shuffle(Area.getCreatures());
			List<Creature> creaturesCopy = new ArrayList<>(Area.getCreatures());
			
		    Iterator<Creature> iterator = creaturesCopy.iterator();
		    while (iterator.hasNext()) {
		        Creature creature = iterator.next();    
		        creature.move();
		        stepNumber += creature.getStepNumber();
		        if(stepNumber > 1000) {break;}
		    }
		}
		showAnimalsNumber();
	}

	
	private static void showAnimalsNumber() {
		Map<Class<? extends Creature>, Integer> animalCounts = new HashMap<>();
	    
	    for (Creature creature : Area.getCreatures()) {
	        Class<? extends Creature> creatureClass = creature.getClass();
	        animalCounts.put(creatureClass, animalCounts.getOrDefault(creatureClass, 0) + 1);
	    }
	    
	    for (Map.Entry<Class<? extends Creature>, Integer> entry : animalCounts.entrySet()) {
	        System.out.println("Number of " + entry.getKey().getSimpleName() + ": "+ entry.getValue());
	    }
    }
	
}
