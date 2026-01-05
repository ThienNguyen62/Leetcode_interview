/*
 Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1

 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
*/


import java.util.*;
public class Main {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        // nhập số phần tử 
        System.out.println(" nhap so luong phan tu: ");
        int n = sc.nextInt();
        int [] nums = new int [n];
        // nhập mảng
        System.out.println(" nhap mang:");
        for (int i =0; i<n;i++)
        {
            nums[i] = sc.nextInt ();

        }
        // chọn cách giải
        System.out.println("chon phuong phap: ");
        System.out.println("1:XOR");
        System.out.println("2:Sort");
        int choice = sc.nextInt();
        int result;
        switch (choice)
        {
            case 1:
                Solution139_1 s1 = new Solution139_1();
                result = s1.singleNumber1(nums);
                System.out.println(" Ket qua : " + result);
                break;
            case 2:
                Solution139_2 s2 = new Solution139_2();
                result = s2.singleNumber2(nums);
                System.out.println(" Ket qua : "+ result);
                break;
            default:
                System.out.println("nothing");
        }
        sc.close ();
    }
}