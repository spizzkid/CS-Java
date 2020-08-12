// Jiacheng Jiang
// Cs 141 Jul 27

// Program still have a flaw, it didn't print out "?" as the instruction required.
import java.util.Scanner;

public class LargeAssignment1 {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("* Birthday Counting Program                      *");
        System.out.println("* Please type in the current date and the name   *");
        System.out.println("**************************************************");

        System.out.print("Today's Month (1-12)");
        System.out.printf("%10s","?");
        int currentMonth = userInput.nextInt();          // get current month from user

        System.out.print("Today's Day (1-" +getDaysInMonth(currentMonth) + ")");
        System.out.printf("%10s","?");
        int currentDay = userInput.nextInt();            // get current day from user

        System.out.print("Person 1's name");
        System.out.printf("%10s","?");
        String person1 = userInput.next();              // get first person name from user

        System.out.print("Person 2's name");
        System.out.printf("%10s","?");
        String person2 = userInput.next();              // get second person name from user

        System.out.print(person1 + "'s Birth Month (1-12)");
        System.out.printf("%10s","?");
        int person1Month = userInput.nextInt();         // get first person birthday month from user

        System.out.print(person1 + "'s Birth Day (1-" + getDaysInMonth(person1Month) + ")");
        System.out.printf("%10s","?");
        int person1Day = userInput.nextInt();           // get first person birthday day from user

        System.out.print(person2 + "'s Birth Month (1-12)");
        System.out.printf("%10s","?");
        int person2Month = userInput.nextInt();         // get second person birthday month from user

        System.out.print(person2 + "'s Birth Day (1-" + getDaysInMonth(person2Month) + ")");
        System.out.printf("%10s","?");
        int person2Day = userInput.nextInt();           // get second person birthday month from user

        int TodayDate = getAbsoluteDate(currentMonth, currentDay);          // calculate absolute date for current day 
        int person1BirthDay = getAbsoluteDate(person1Month, person1Day);    // calculate absolute date for first person's birthday
        int person2BirthDay = getAbsoluteDate(person2Month, person2Day);    // calculate absolute date for second person's birthday

        int p1NextBirthDay = subtractAbsoluteDate(TodayDate, person1BirthDay); // use subtract method to calculate first person's next birthday
        int p2NextBirthDay = subtractAbsoluteDate(TodayDate, person2BirthDay); // use subtract method to calculate second person's next bithday

        System.out.println("*** Calculating ***");
        // print the results
        System.out.println("It is " + p1NextBirthDay + " days until " + person1 + "'s next birthday.");
        System.out.println("It is " + p2NextBirthDay + " days until " + person2 + "'s next birthday.");

        int gap1 = subtractAbsoluteDate(person1BirthDay, person2BirthDay); // use subtract method to calculate gap from p1 to p2
        int gap2 = subtractAbsoluteDate(person2BirthDay, person1BirthDay); // use subtract method to calculate gap form p2 to p1

        // print the results
        System.out.println("There is a " + gap1 + " day gap from " + person1 + "'s to " + person2 + "'s birthday");
        System.out.println("There is a " + gap2 + " day gap from " + person2 + "'s to " + person1 + "'s birthday");

        System.out.println("**************************************************");
        // end of program
    }

    // create method convert date into an absolute number
    public static int getAbsoluteDate(int month, int day) {
        int Jan = 31, Feb = 28, Mar = 31, Apr = 30, May = 31, Jun = 30,
            Jul = 31, Aug = 31, Sep = 30, Oct = 31, Nov = 30;
        int absoluteDate = 0;
        // absolute date equal current months minus one then plus current days
        
        if (month == 1) {
            absoluteDate = day;
        } else if (month == 2) {
            absoluteDate = Jan + day;
        } else if (month == 3) {
            absoluteDate = Jan + Feb + day;
        } else if (month == 4) {
            absoluteDate = Jan + Feb + Mar + day;
        } else if (month == 5) {
            absoluteDate = Jan + Feb + Mar + Apr + day;
        } else if (month == 6) {
            absoluteDate = Jan + Feb + Mar + Apr + May + day;
        } else if (month == 7) {
            absoluteDate = Jan + Feb + Mar + Apr + May + Jun + day;
        } else if (month == 8) {
            absoluteDate = Jan + Feb + Mar + Apr + May + Jun + Jul + day;
        } else if (month == 9) {
            absoluteDate = Jan + Feb + Mar + Apr + May + Jun + Jul + Aug + day;
        } else if (month == 10) {
            absoluteDate = Jan + Feb + Mar + Apr + May + Jun + Jul + Aug + Sep + day;
        } else if (month == 11) {
            absoluteDate = Jan + Feb + Mar + Apr + May + Jun + Jul + Aug + Sep + Oct + day;
        } else if (month == 12) {
            absoluteDate = Jan + Feb + Mar + Apr + May + Jun + Jul + Aug + Sep + Oct + Nov + day;
        }

        return absoluteDate;
    }
    // method for subtract absolute date
    public static int subtractAbsoluteDate(int day1, int day2) {
        int result = 0;
        // using if statement to determine the different situation
        if (day1 > day2) {
            result = 365 - Math.abs(day1 - day2);
        } else if (day1 < day2) {
            result = day2 - day1;
        }
        return result;
    }
    // method for determine how many days in each month
    public static int getDaysInMonth(int month) {
        int days = 0;
        if (    month == 1 || month == 3 || month == 5 ||
                month == 7 || month == 8 || month == 10 ||
                month == 12) {
            days = 31;
        } else if ( month == 4 || month == 6 ||
                    month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            days = 28;
        }
        return days;
    }
}
