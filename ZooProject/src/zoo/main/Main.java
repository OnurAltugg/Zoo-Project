package zoo.main;

import zoo.area.Area;
import zoo.model.*;


public class Main {

	public static void main(String[] args) {
		for(int i = 1; i <= 30; i++) {
			Area.addCreature(new Sheep());
		}
		for(int i = 1; i <= 10; i++) {
			Area.addCreature(new Cow());
		}
		for(int i = 1; i <= 10; i++) {
			Area.addCreature(new Chicken());
		}
		for(int i = 1; i <= 10; i++) {
			Area.addCreature(new Wolf());
		}
		for(int i = 1; i <= 10; i++) {
			Area.addCreature(new Rooster());
		}
		for(int i = 1; i <= 8; i++) {
			Area.addCreature(new Lion());
		}
		Area.addCreature(new HunterHuman());
		for (Creature creature : Area.getCreatures()) {
			System.out.println(creature);
		}
	}

}
