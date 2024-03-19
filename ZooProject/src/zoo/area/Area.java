package zoo.area;

import java.util.ArrayList;
import java.util.List;

import zoo.model.Creature;

public class Area {
	
	private static List<Creature> creatures = new ArrayList<>();
	private static Creature[][] zoo = new Creature[500][500];

	public static List<Creature> getCreatures() {
		return creatures;
	}

	public static void addCreature(Creature creature) {
	    creatures.add(creature);
	}

	public static void removeCreature(Creature creature) {
	    creatures.remove(creature);
	}
	
	public static Creature[][] getZoo() {
		return zoo;
	}

}
