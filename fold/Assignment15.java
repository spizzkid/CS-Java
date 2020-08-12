// Jiacheng Jiang
// cs 141 Aug 3
import java.util.*;
import java.io.*;

public class Assignment15 {

    public static void main(String [] args) {
        // open file
        File salaryInfo = new File("CS141 -EmployeeData.txt");
        Scanner input = null;
        
        try
        {
            input = new Scanner(salaryInfo);
        }
        catch(Exception e)
        {
            System.out.println("Error opening file, quitting now.");
            System.exit(-1);
        }
        // initialization
        double totalSalary = 0;
        double salaryAfterTax = 0;
        
        // get info from file
            while(input.hasNext()) {
            int totalHours = 0;
            String name = input.next();            // get employee's name
            double salary = input.nextDouble();    // get salary per hour
            while(input.hasNextInt()) {            // get worked hours
                int hours = input.nextInt();
                totalHours += hours;
            }
            
            totalSalary = salary * totalHours;
            
            // determine whether salary is exceed $400 or not
            if (totalSalary >= 400) {
                salaryAfterTax = totalSalary * (1-0.33);
                System.out.printf("%s worked for a total of: %d hours at $%.2f an hour for a gross pay of $%.2f\n", name, totalHours, salary, totalSalary);
                System.out.printf("After 33%% taxes their total net pay should be $%.2f\n",salaryAfterTax);
            } else{
                salaryAfterTax = totalSalary * (1-0.25);
                System.out.printf("%s worked for a total of: %d hours at $%.2f an hour for a gross pay of $%.2f\n", name, totalHours, salary, totalSalary);
                System.out.printf("After 25%% taxes their total net pay should be $%.2f\n",salaryAfterTax);
            }
            System.out.println();
        }
    }

}
