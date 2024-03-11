package com.zoo.area;

import java.util.ArrayList;
import java.util.List;

import com.zoo.model.Creature;

public class Area {
	
	private static List<Creature> creatures = new ArrayList<>();
	

	public static List<Creature> getCreatures() {
		return creatures;
	}
	
	public static void addCreature(Creature creature) {
		creatures.add(creature);
	}
	
	public static void removeCreature(Creature creature) {
		creatures.remove(creature);
	}

}
