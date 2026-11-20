/*
Given two strings needle and haystack, return the index of the first occurrence 
of needle in haystack, or -1 if needle is not part of haystack.

 
Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 */

// tìm vị trí đầu tiên chuỗi 2 xuất hiện trong chuỗi 1
import java.util.Scanner;

public class main28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap haystack: ");
        String haystack = sc.nextLine();

        System.out.print("Nhap needle: ");
        String needle = sc.nextLine();

        System.out.println("Chon phuong phap:");
        System.out.println("1. Brute Force");
        System.out.println("2. indexOf()");

        int choice = sc.nextInt();

        int result = -1;

        if (choice == 1) {

            Solution28_1 s1 = new Solution28_1();
            result = s1.strStr1(haystack, needle);

        } else if (choice == 2) {

            Solution28_2 s2 = new Solution28_2();
            result = s2.strStr2(haystack, needle);

        } else {
            System.out.println("Lua chon khong hop le");
            return;
        }

        System.out.println("Ket qua: " + result);

        sc.close();
    }
}