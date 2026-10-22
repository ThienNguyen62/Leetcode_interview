/*
Given an array of integers nums and an integer target, return indices of the two numbers such that 
they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.


Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Nhập số phần tử
        System.out.println("Nhap so phan tu :");
        int n =sc.nextInt();
        int []nums = new int [n];

        // nhập mảng
        System.out.println("nhap cac phan tu: ");
        for (int i =0;i<n;i++)
        {
            nums[i]= sc.nextInt();
        }
        // nhập target
        System.out.println(" nhap target:");
        int target = sc.nextInt();

        // chọn cách giải 
        System.out.println("Chon cach giai:");
        System.out.println("1. Brute Force");
        System.out.println("2. Two-pass Hash Table");
        System.out.println("3. One-pass Hash Table");
        int choice = sc.nextInt();
        int []result = new int [2]; // 2 phần tử

        switch (choice)
        {
            case 1:
                Solution1_1 s1 = new Solution1_1();
                result = s1.TwoSum1(nums,target);
                break;
            case 2:
                Solution1_2 s2 = new Solution1_2();
                result = s2.TwoSum2(nums,target);
                break;
            case 3:
                Solution1_3 s3 = new Solution1_3();
                result = s3.TwoSum3(nums,target);
                break;  
            default:
                System.out.println(" khong co lua chon hop le");
                return;
        }
        // in kết quả
                if (result.length == 0) {
            System.out.println("Khong tim thay cap phu hop");
        } else {
            System.out.println("Ket qua: [" + result[0] + ", " + result[1] + "]");
        }

        sc.close();
    }
}
