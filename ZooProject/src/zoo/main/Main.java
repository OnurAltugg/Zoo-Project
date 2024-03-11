package com.zoo.main;

import com.zoo.area.Area;
import com.zoo.model.Creature;
import com.zoo.model.Sheep;

public class Main {
	
	public static void createAnimals(int numberOfAnimals, Creature creature) {
		for(int i = 1; i<=numberOfAnimals; i++) {
			
		}
	}

	public static void main(String[] args) {
		for(int i = 1; i <= 30; i++) {
			Area.addCreature(new Sheep());
		}
		for (Creature x : Area.getCreatures()) {
			System.out.println(((Sheep) x).getGender());
			System.out.println(((Sheep) x).getLocation().getRowPosition());
			System.out.println(((Sheep) x).getLocation().getColumnPosition());
		}
	}

}
