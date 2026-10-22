/*
given two strings s and t
return true if t is an anagram of s, and false otherwise
Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
*/
/*
hai chuỗi là anagram nếu nó có cùng ký tự với tần suất xuất hiện giống nhau, không 
phân biệt thức tự. Một số biến thể có thể yêu cầu bỏ qua chữ hoa/ thường hoặc kí tự đặc biệt */
import java.util.Scanner;
import java.util.*;
public class main242 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi thu nhat (chi a-z): ");
        String s = scanner.nextLine();

        System.out.println("Nhap chuoi thu hai (chi a-z): ");
        String t = scanner.nextLine();

        System.out.println("Chon phuong phap:");
        System.out.println("1 - Sort");
        System.out.println("2 - Array");
        System.out.println("3 - HashMap");

        int choice = scanner.nextInt();

        boolean result = false;

        if (choice == 1) {

            Solution242_1 solution = new Solution242_1();
            result = solution.isAnagram1(s, t);

        } else if (choice == 2) {

            Solution242_2 solution = new Solution242_2();
            result = solution.isAnagram2(s, t);

        } else if (choice == 3) {

            Solution242_3 solution = new Solution242_3();
            result = solution.isAnagram3(s, t);

        } else {

            System.out.println("Lua chon khong hop le.");
            scanner.close();
            return;
        }

        if (result) {
            System.out.println("Hai chuoi la Anagram.");
        } else {
            System.out.println("Hai chuoi KHONG phai Anagram.");
        }

        scanner.close();
    }
}