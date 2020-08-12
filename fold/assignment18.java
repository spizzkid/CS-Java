// Jiacheng Jiang
// cs 141
// Aug 6

import java.util.*;


public class assignment18 {


        public static void main(String [] args) {
            Scanner userInput = new Scanner(System.in);
            String str;
            
            // keep using vowelCount method until user enter STOP 
            while(true) {
                    System.out.print("Enter a sentence: ");
                    str = userInput.nextLine();
                    if(str.equals("STOP")) {
                        System.out.print("quitting now");
                        break;
                    }
                    // print out the result
                    int[] arr = vowelCount(str);
                    System.out.println(Arrays.toString(arr));
            }


        }



        public static int[] vowelCount(String input) {

            int[] numOfVowel = new int[5];
            input = input.toLowerCase();                // make every char to lowercase then determine numbers of vowel
            // detect nubmer of vowels then add 1 to the corresponding array
            for (char ch: input.toCharArray()) {
                if (ch == 'a') {
                    numOfVowel[0]++;
                }
                else if (ch == 'e') {
                    numOfVowel[1]++;
                }
                else if (ch == 'i') {
                    numOfVowel[2]++;
                }
                else if (ch == 'o') {
                    numOfVowel[3]++;
                }
                else if (ch == 'u') {
                    numOfVowel[4]++;
                }
            }
            return numOfVowel;
        }
}
