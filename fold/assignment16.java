// Jiacheng Jiang
// cs 141 Aug 4

import java.util.*;
import java.io.*;

public class assignment16 {
    public static void main(String [] args) {

        Scanner userInputNum = new Scanner(System.in);                  // get necessary information from user
        Scanner userInputString = new Scanner(System.in);

        System.out.println("How many random numbers do they want?");
        int numbers = userInputNum.nextInt();

        System.out.println("What is the smallest random number?");
        int smallestNum = userInputNum.nextInt();

        System.out.println("What is the largest random number?");
        int largestNum = userInputNum.nextInt();

        System.out.println("What filename do they want to use?");
        System.out.print("-->");
        String fName = userInputString.nextLine();



        int range = largestNum - smallestNum + 1;

        int position = 1;              
        String output = "";                           // store all numbers into a string

        for (int i = 0; i < numbers ; i++) {

            int rand = (int) (Math.random()*range) + smallestNum;    // set range

            if (position == 5)                  // for reset to new line when there are 5 numbers in a line
            {
                output = output + rand + ",\n";
                position = 1;
            }
            else
            {
                if(i == numbers -1)             //  print the last number without ","
                {
                    output = output + rand;
                }
                else
                {
                    output = output + rand + ",";

                }
                position++;
            }
        }
        // print information to the file
        try {
            PrintStream newFile = new PrintStream(fName);
            newFile.println(output);
        }
        catch (Exception e) {
            System.out.println("Illegal input, quitting now");
            System.exit(-1);
        }

    }
}
