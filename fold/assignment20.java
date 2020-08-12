// Jiacheng Jiang
// cs141 Aug 10

import java.util.Arrays;

public class assignment20 {
    public static void main(String[] args)
    {
        int[] array1 = {1, 4, 6, 8, 3, 4,  16, 7,0, 1};
        int[] array2 = {8, 7, 6, 4, 9, 12, 12, 8, 11, 12, 20};
        int[] array1b, array2b;

        array1b = collapse(array1);
        array2b = collapse(array2);

        System.out.println("Before : " + Arrays.toString(array1) );
        System.out.println("After : " + Arrays.toString(array1b) );
        System.out.println("******");
        System.out.println("Before : " + Arrays.toString(array2) );
        System.out.println("After : " + Arrays.toString(array2b) );

    }

    public static int[] collapse(int[] inPutArray) {
        // determine length of array is even or odd

        if (inPutArray.length % 2 == 0) {
            int[] newArray = new int[inPutArray.length / 2];
            int j = 0;
            for(int i = 0; i < inPutArray.length; i+=2) {
                newArray[j++] = inPutArray[i] + inPutArray[i+1];
            }
            return newArray;
        }

        else {
            int[] newArray = new int[inPutArray.length / 2 + 1];
            int j = 0;
            for(int i = 0; i < inPutArray.length - 1; i+=2) {
                newArray[j++] = inPutArray[i] + inPutArray[i+1];
            }
            // add last number in input array to the new array
            newArray[inPutArray.length / 2] = inPutArray[inPutArray.length - 1];

            return  newArray;
        }

    }
}