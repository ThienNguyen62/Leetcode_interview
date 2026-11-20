/*
Given a string s, find the first non-repeating character in it and return its index. If it does not
 exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.
Example 2:
Input: s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1

Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.
 */
import java.util.*;
public class Main387 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // nhập chuỗi
        System.out.println(" nhap chuoi");
        String s = sc.nextLine();

        // kiểm tra điều kiện
        if (s.length() < 1 || s.length() > 100000)
        {
            System.out.println("khong hop le");
             return;
        }
         for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < 'a' || c > 'z') {
                System.out.println("Chuoi chi duoc chua chu cai thuong a-z");
                return;
            }
        }
         System.out.println("Chon cach giai:");
        System.out.println("1 - Su dung MANG");
        System.out.println("2 - Su dung HASHMAP");
        System.out.print("Lua chon cua ban: ");

        int choice = sc.nextInt();

        int result;

        switch (choice) {
            case 1:
                Solution385_1 sol1 = new Solution385_1();
                result = sol1.firstUniqChar1(s);
                break;

            case 2:
                Solution385_2 sol2 = new Solution385_2();
                result = sol2.firstUniqChar2(s);
                break;

            default:
                System.out.println("Lua chon khong hop le");
                return;
        }

        System.out.println("Index ky tu khong lap dau tien = " + result);
    }


    
}
