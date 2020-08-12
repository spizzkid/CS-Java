Write a method called kthLargest() that accepts an integer x and an array a of integers as its parameters.   It should then return the elements that that k elements of greater or equal value.   So if k = 0 return the largest element.  If k = 1. return the second-largest element, and so on.  Do not change the array itself, but you can make a copy if you want.

 

For example if array1 = {74, 85, 102, 99, 101, 56, 84} and the function kthLargest(2, array1)  is called, then your method should return 99 because there are two values that are larger than 99.   (101 and 102).    

 

If x is less than zero or greater than/equal to the the size of the array then return -9999;

 

Make sure your main function works for the following

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
