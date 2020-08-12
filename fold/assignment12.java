import java.util.*;

public class assignment12 {

    public static void assignment(String [] args) {
        // call method
        randomWalk(30);
    }
    // create method
    public static int randomWalk(int x) {
        int numOfSteps = 0;
        int position = 0;

        System.out.println("position = " + position);

        // keep increase 1 or decrease 1 before position reach the x or -x;
        while (position != x || position != -x) {
            // generate a variable either be true or false
            Random rand = new Random();
            boolean val = rand.nextInt(2) == 0;

            if (val == true) {
                position++;
                System.out.println("position = " + position);
            }
            else if (val == false) {
                position--;
                System.out.println("position = " + position);
            }
            // steps + 1
            numOfSteps++;
        }

        System.out.println("Steps = " + numOfSteps);
        return numOfSteps;
    }
}
