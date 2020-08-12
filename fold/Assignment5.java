// Jiacheng Jiang
// cs 141

public class Assignment5 {
   
  
   
   public static void main (String [] args) {
   
    // call the method
    
      printStar(7, 3);
      printStar(4, 9);
      printStar(8, 9);
      printStar(3, 1);
      printStar(5, 2);
      
     
   }
   
   // create method
   
   public static void printStar(int num, int row) {

      for (int i = 1; i <= row; i++) {
         for (int j = 1; j <= num; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
    System.out.println();
   }
}