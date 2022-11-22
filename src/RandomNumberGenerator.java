import java.util.Random;

/**
 * Create a class that displays random numbers
 *
 * @author brad_
 */

public class RandomNumberGenerator {

    /**
     * Method that sets an int range for random number generation
     * @param args -
     */

    public static void main(String[] args) {

        System.out.println("10 random numbers from 1 to 100:\n");
        Random random = new Random(); // create Random instance
        int i; // set i variable

        // As long as there are less than 10 numbers, generate a random number
        for (i = 0; i < 10; i++) {
            // Possible numbers range from 1 to 100; display
            System.out.printf("%d ", random.nextInt(100));
        }
    }
}
