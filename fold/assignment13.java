// Jiacheng Jiang
// cs 141
import java.util.*;

public class assignment13 {


    public static void main(String [] args) {

        Scanner userInput = new Scanner(System.in);
        
        // get user input
        System.out.print("What size walk do you want to test?");
        int size = userInput.nextInt();
        
        int totalNumOfSteps = 0;
        // call method, use it 10000 times
        for (int i = 1; i <= 10000;i++) {
            totalNumOfSteps =  totalNumOfSteps + randomWalk(size);
            // show the progress
            System.out.println(i + " loops complete");
        }
        // print fianl result
        System.out.println("For a walk of size " + size + " after 10,000 tries, on average it took " +
                            Math.abs(totalNumOfSteps / 10000.0) + " ste1ps to get there.");

    }
    public static int randomWalk(int x) {
        int numOfSteps = 0;
        int position = 0;

        // keep increase 1 or decrease 1 before position reach the x or -x;
        while (position != x && position != -x) {
            // generate a variable either be true or false
            Random rand = new Random();
            int val = rand.nextInt(2);

            if (val == 1) {
                position++;
            }
            else if (val == 0) {
                position--;
            }
            // steps + 1
            numOfSteps++;
        }
        return numOfSteps;
    }


}