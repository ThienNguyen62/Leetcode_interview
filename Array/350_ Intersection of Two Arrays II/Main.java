/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 

Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập nums1
        System.out.print("Nhap so phan tu nums1: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Nhap nums1:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        // Nhập nums2
        System.out.print("Nhap so phan tu nums2: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Nhap nums2:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        // Chọn cách giải
        System.out.println("Chon cach giai:");
        System.out.println("1 - HashMap");
        System.out.println("2 - Two Pointers");
        int choice = sc.nextInt();

        int[] result;

        switch (choice) {
            case 1:
                Solution350_1 s1 = new Solution350_1();
                result = s1.intersect1(nums1, nums2);
                break;

            case 2:
                Solution350_2 s2 = new Solution350_2();
                result = s2.intersect2(nums1, nums2);
                break;

            default:
                System.out.println("Lua chon khong hop le!");
                return;
        }

        // In kết quả
        System.out.print("Ket qua: ");
        System.out.println(Arrays.toString(result));
    }
}
