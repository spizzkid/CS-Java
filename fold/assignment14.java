// Jiacheng Jiang
// cs141 Jul 29
import java.io.*;
import java.util.*;

public class assignment14 {

    public static void main(String [] args) {

        File readNum = new File("CS141-1201Numbers.txt");

        Scanner input = null;

        try
        {
            input = new Scanner(readNum);
        }
        catch (Exception e)
        {
            System.out.println("file not found");
            System.exit(-1);
        }
        int sum = 0;
        while(input.hasNext())
        {

            int num = input.nextInt();
            sum = sum + num;
        }

        System.out.println("The sum of numbers inside file is " + sum);
    }

}
