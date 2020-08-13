// Jiacheng Jiang
// cs 141 Aug/12

import java.util.*;
import java.io.*;

public class LargeAssignment3 {

    public static void main(String [] args) {
        
        System.out.println("This program processes a file of DNA structures for various biological");
        System.out.println("samples to determine if a mutation of a particular nature has occurred.");
        
        Scanner keyboard = new Scanner(System.in);
        String inputFileName, outputFileName;
        
        // create 2 array for frequency and percent, compare them in the later program
        
        int freq1[], freq2[],per1[],per2[];

        System.out.print("input file name?");       
        inputFileName = keyboard.nextLine();        // get user input file name 
        System.out.print("output file name?");
        outputFileName = keyboard.nextLine();       // get user output file name


        try {
            Scanner fileScanner = new Scanner(new File(inputFileName));   // open input file
            PrintStream writer = new PrintStream(outputFileName); // create output file
            // read data from file
            while(fileScanner.hasNextLine())
            {
                // read 1 line for header
                // read 2 lines of DNA
                String header = fileScanner.nextLine();
                String line1 = fileScanner.nextLine();
                String line2 = fileScanner.nextLine();

                // calculate frequency and percentage
                freq1 = countABCD(line1);
                freq2 = countABCD(line2);
                per1 = percentageOfABCD(freq1);
                per2 = percentageOfABCD(freq2);

                // print result into file
                writer.println(header);
                // print number of A-D
                writer.print("Before:");
                printResult(freq1, writer,false);
                writer.print("After:");
                printResult(freq2, writer,false);
                // print percentage of A-D
                writer.print("\nBefore:");
                printResult(per1, writer, true);
                writer.print("After:");
                printResult(per2, writer, true);

                writer.println();
                // mutation detect
                if(mutationDetect(freq1, freq2, per1, per2))
                {
                    writer.println("DIFFERENT");
                }
                else
                {
                    writer.println("MATCH");
                }
            }
        }
        catch (Exception e) {
            System.out.println("Error inputting/outputting file, quitting now");
            System.exit(-1);
        }
        // end of the main program
    }


    // method for count number of A-D in a input line
    public static int[] countABCD(String line)
    {
        int[] occur = new int[4];   // create an array length 4

        // loop to determine if letter is between A-D
        for(int i = 0; i < line.length(); i++) {
            if(line.toUpperCase().charAt(i) == 'A') {
                occur[0]++;
            }
            else if (line.toUpperCase().charAt(i) == 'B'){
                occur[1]++;
            }
            else if (line.toUpperCase().charAt(i) == 'C'){
                occur[2]++;
            }
            else if (line.toUpperCase().charAt(i) == 'D'){
                occur[3]++;
            }
        }
        return occur;
    }

    // method to get percentage of A-D in a input line
    public static int[] percentageOfABCD(int freq[]) {

        int total = 0;

        // get the total letters
        for(int i = 0; i < freq.length; i++) {
            total += freq[i];
        }

        int[] percent = new int[freq.length];

        for(int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                percent[i] = (int) Math.round(freq[i] * 100 / total);
            }
            else {
                percent[i] = 0;
            }
        }
        return percent;
    }

    // method for determine whether is mutation or not
    public static boolean mutationDetect(int freq1[], int freq2[], int per1[], int per2[]) {
        
        for(int i = 0;i< freq1.length;i++) {
            if(freq1[i] != freq2[i] && per1[i] != per2[i]) {
                return true;
            }
        }
        return false;
    }

    // method to print result to file
    public static void printResult(int data[], PrintStream writer, boolean percent) {   // true for print percent, false for print A-D occur number
        
        if(percent)
        {
            for(int i = 0; i < data.length - 1; i++)
            {
                writer.print(data[i] + "%/");
            }
            writer.print(data[data.length-1]+"%  ");
        }
        else
        {
            for(int i = 0; i < data.length; i++)
            {
                writer.print(data[i]+"-");
            }
            writer.print(data[data.length-1]+"  ");
        }
    }

}