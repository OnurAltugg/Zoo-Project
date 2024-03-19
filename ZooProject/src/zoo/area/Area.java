package zoo.area;

import java.util.ArrayList;
import java.util.List;

import zoo.model.Creature;

/**
 * The {@code Area} class represents an area within a zoo where creatures can be placed.
 * It provides methods to manage the creatures within the area and access the zoo grid.
 */
public class Area {
	
	/**
     * List of creatures currently in the area.
     */
	private static List<Creature> creatures = new ArrayList<>();
	
	/**
     * A grid representing the zoo area.
     */
	private static Creature[][] zoo = new Creature[500][500];
	
	 /**
     * Retrieves the list of creatures currently in the area.
     * 
     * @return the list of creatures
     */
	public static List<Creature> getCreatures() {
		return creatures;
	}
	
	/**
     * Adds a creature to the area.
     * 
     * @param creature the creature to add
     */
	public static void addCreature(Creature creature) {
	    creatures.add(creature);
	}
	
	/**
     * Removes a creature from the area.
     * 
     * @param creature the creature to remove
     */
	public static void removeCreature(Creature creature) {
	    creatures.remove(creature);
	}
	
	/**
     * Retrieves the grid representing the zoo area.
     * 
     * @return the zoo grid
     */
	public static Creature[][] getZoo() {
		return zoo;
	}

}
