// Jiacheng Jiang
// cs 141

public class Assignment7 {
   
   public static void main (String [] args) {
      double result1, result2, result3;
   
      result1 = triangleArea(5, 6 ,7);
      result2 = triangleArea(12, 13, 14);
      result3 = triangleArea(300, 400, 500);
   
      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
   }
   
   //create method
   public static double triangleArea (int a, int b, int c) {
   
      double area, s;
   // compute s and area of triangle
      s = (a + b + c ) / 2;
   
      area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
   
      return area;
   
   }
}