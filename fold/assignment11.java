// Jiacheng Jiang 
// cs 141 Jul 22

public class assignment11 
{



   public static void main(String [] arg) 
   { // call method
      System.out.println(showTwos(7));
      System.out.println(showTwos(18));
      System.out.println(showTwos(68));
      System.out.println(showTwos(120));
      System.out.println(showTwos(192));
      System.out.println(showTwos(8));
   }
   
   
   
// create method, calculate factors of a number    
   public static String showTwos(int num) 
   {  
      System.out.print(num + " = ");
      while (num % 2 == 0)
      {
         System.out.print("2 * ");
         num = num / 2;
      }
      
      
      String str = String.valueOf(num);
      
   
      return str;
   }
}