/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric 
characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters. */
import java.util.*;
public class main125 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Nhập chuỗi
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        // Chọn phương pháp
        System.out.println("Chọn phương pháp:");
        System.out.println("1 - Dùng 2 con trỏ");
        System.out.println("2 - Dùng đảo chuỗi");
        System.out.print("Lựa chọn của bạn: ");
        int choice = sc.nextInt();

        boolean result = false;
        switch (choice)
        {
            case 1:
                Solution125_1 s1= new Solution125_1();
                result=s1.isPalindrome1(s);
                break;
            case 2:
                Solution125_2 s2= new Solution125_2();
                result=s2.isPalindrome2(s);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
        if (result) {
            System.out.println("Chuỗi là palindrome.");
        } else {
            System.out.println("Chuỗi không phải là palindrome.");  
            
        }
        sc.close();
    }
}
