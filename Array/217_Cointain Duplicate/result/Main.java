/* Cointain Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false 
if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.
Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.
Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 
Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */

import java.util.*;
// duyệt lần lượt độ chạy là 0(n^2) không tối ưu
public class Main {
       // hàm main
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" nhap so phan tu cua mang :");
        int n = sc.nextInt();
        System.out.println(" nhap mang n phan tu: ");
        int [] nums = new int [n];
        for (int i = 0;i<n;i++)
        {
            nums[i]= sc.nextInt ();
        }
        // choose a solution
        System.out.println("choose a solution: ");
        System.out.println(" 1 - Sort + check duplicate element");
        System.out.println(" 2 - Use Set Hash");

        int choice = sc.nextInt ();
        boolean result = false;
        
        switch (choice) {
            case 1:
                Solution217_1 s1 = new Solution217_1();
                result = s1.containsDuplicate(nums);
                break;

            case 2:
                Solution217_2 s2 = new Solution217_2();
                result = s2.containsDuplicate(nums);
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ!");
                sc.close();
                return;
        }

        System.out.println("Ket qua: " + result);
        sc.close();

    }


}
