/*
  Rotate Array
Solution
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]


Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 

Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to 
solve this problem.
Could you do it in-place with O(1) extra space? 
*/

import java.util.*;

public class Main {
   private static void printArray(int[] nums) {
    System.out.print("[");
    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i]);
        if (i < nums.length - 1) {
            System.out.print(",");
        }
    }
    System.out.println("]");
}

    public static void main (String [] args)
    {
      Scanner sc = new Scanner(System.in);
      // INput
      System.out.println("Enter n:");
      int n =sc.nextInt();
      int [] nums = new int [n];
      System.out.println("Enter array elements: ");
      for ( int i =0; i<n;i++)
        {
           nums[i]=sc.nextInt();
        }
      System.out.println(("enter k "));
      int k =sc.nextInt();
       System.out.println("\nChoose solution:");
        System.out.println("1 - One By One");
        System.out.println("2 - Reverse Algorithm");
        System.out.println("3 - Temporary Array");
        System.out.print("Your choice: ");
        int choice =sc.nextInt ();

      int []testArray = nums.clone();
      switch(choice)
      {
        case 1: // The method rotate(int[], int) is undefined for the type Solution1
          new Solution189_1().rotate1(testArray,k);
          break;
        case 2:
          new Solution189_2().rotate2(testArray,k);
          break;
        case 3:
          new Solution189_3().rotate3(testArray,k);
          break;
        default:
          System.out.println("nothing");
          return;
      }
      System.out.println("results:");
      printArray(testArray);
    }
}
