// Jiacheng Jiang
// cs141

import java.util.Scanner;

public class Assignment9 {
   public static void main (String [] args) {
   Scanner angles = new Scanner(System.in);
   
   // ask user to input three sides of the triangle
   System.out.println("Please type a number as first side of a triangle: ");
   double angle1 = angles.nextDouble();
   System.out.println("Please type a number as second side of a triangle: ");
   double angle2 = angles.nextDouble();
   System.out.println("Please type a number as third side of a triangle: ");
   double angle3 = angles.nextDouble();
   
   // call the method first time and print result
   double result1 = findAngle(angle1, angle2, angle3);
   System.out.println(result1);
   
   // second time and print
   double result2 = findAngle(angle3, angle1, angle2);
   System.out.println(result2);
   
   // third time and print
   double result3 = findAngle(angle2, angle3, angle1);
   System.out.println(result3);

   
   }
   // create method
   public static double findAngle(double a, double b, double c) {
   double degree;
   
   // calculate number
   degree = Math.acos((a*a+b*b-c*c)/(2.0*a*b));
   // convert to degree
   degree = Math.toDegrees(degree);
   
   return degree;
   
   }
}