// Jiacheng Jiang
// cs 141

public class Assignment6 {
   
   public static void main (String [] args) {
   // call the method
   printQuadratic(1, -7, 12);
   printQuadratic(2, 6, 4);
   }
   
   // create the print quadratic method
   public static void printQuadratic (double a, double b, double c) {
   
   double result1, result2;
   // calculate the first root of the equation
   result1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
   System.out.print(result1);
   
   // add space between results
   System.out.print(" ");
   
   // calculate the second root of the equation
   result2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);   
   System.out.print(result2);
   
   System.out.println();
   }
}
