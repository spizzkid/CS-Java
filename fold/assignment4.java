// Jiacheng Jiang
// cs 141

public class assignment4 {
   public static void main(String [] args) {
      // initialize the total rice and rice count
      int totalRice, riceCount;
      riceCount = 1;      
      totalRice = 1;
      
      // print day1 rice amount
      System.out.println("Day#" + 1 + "-Rice count = " + riceCount + "-Total Rice count = " + totalRice);
      
      // rice amout from day 2 to day 30
      for (int i = 2; i <=30; i++) {
      riceCount *= 2;
      totalRice += riceCount;
      System.out.println("Day#" + i +"-Rice count = " + riceCount + "-Total Rice count = " + totalRice);
      }
      // print rice summary
      System.out.println("The total rice was = " + totalRice);
   }
}