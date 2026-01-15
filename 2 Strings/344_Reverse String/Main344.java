/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
 */

/*
nếu ko inplace thì có thể tạo mảng mới rồi duyệt từ cuối về đầu */
import java.util.*;
public class Main344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // nhập chuỗi
        System.out.println("moi nhap chuoi");
        String input = sc.nextLine();
        int n = input.length();
        // kiểm tra điều kiện
        if ( n <1 || n>100000)
        {
            System.out.println( " chuoi khong hop le (1<= length <=10^5)");
            return;
        }
        // check kí tự
        for ( int i =0;i<input.length();i++)
        {
            char currentChar = input.charAt (i);
            // ASCII in được nằm trong khoảng từ 32 đến 126
            if ( currentChar< 32 || currentChar >126)
            {
                System.out.println("chuoi khong hop le");
                return;
            }
        }
        // chuyển sang char
        char [] s = input.toCharArray();
        // chọn cách giải
         System.out.println("\nChon cach dao chuoi:");
        System.out.println("1 - Tao mang moi (O(n) space)");
        System.out.println("2 - Two Pointers (O(1) space) [KHUYEN DUNG]");
        System.out.println("3 - De quy");
        System.out.println("4 - Built-in");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                new Solution344_1().reverseString1(s);
                break;
            case 2:
                new Solution344_2().reverseString2(s);
                break;
            case 3:
                new Solution344_3().reverseString3(s);
                break;
            case 4:
                new Solution344_4().reverseString4(s);
                break;
            default:
                System.out.println("Lua chon khong hop le!");
                return;
             // ===== In kết quả =====
        }
        System.out.println("\nChuoi sau khi dao:");
        System.out.println(new String(s));

        sc.close();
    
}
}