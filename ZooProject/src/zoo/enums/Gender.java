package zoo.enums;

import java.util.Random;

/**
 * The {@code Gender} enum represents the gender of a creature in the zoo.
 * It provides random genders.
 */
public enum Gender {
	
	/**
     * Represents the male gender.
     */
	MALE,
	
	/**
     * Represents the female gender.
     */
	FEMALE;
	
	/**
     * Generates a random gender.
     * 
     * @return a randomly selected gender
     */
	public static Gender getRandomGender() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}
