// Jiacheng Jiang
// cs 141 Aug 10

import java.util.Arrays;
import java.util.Collections;

public class assignment19 {
    public static void main(String[] args)
    {
        int[] array1 = {6, 8, 2, 3, 5, 12, 16, 1, 7, 4, 21, 19};
        int answer = kthLargest(0,array1);
        System.out.println(answer);
        answer = kthLargest(1,array1);
        System.out.println(answer);
        answer = kthLargest(2,array1);
        System.out.println(answer);
        answer = kthLargest(10,array1);
        System.out.println(answer);
        answer = kthLargest(11,array1);
        System.out.println(answer);
        answer = kthLargest(-1,array1);
        System.out.println(answer);
        answer = kthLargest(20,array1);
        System.out.println(answer);

        System.out.println("Make sure the array didn't change as a side effect.");
        System.out.println(Arrays.toString(array1));
    }


    public static int kthLargest(int x, int[] a) {
    
        // make a copy of the array, then sort
        int[] copyArray = new int[a.length];
        
        if (x < 0 || x >= a.length) {
            return -9999;
        }
        else {
            for (int i = 0; i < a.length ; i++) {
              copyArray[i] = a[i];
            }
            // sort array from largest to smallest
            int temp = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if(copyArray[i] < copyArray[j]) {
                        temp = copyArray[i];
                        copyArray[i] = copyArray[j];
                        copyArray[j] = temp;
                    }
                }
            }
            return copyArray[x];
        }
    }

}