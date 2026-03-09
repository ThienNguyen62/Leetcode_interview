/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
 */
import java.util.*;
public class main14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong chuoi: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        System.out.println("Nhap cac chuoi:");

        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        System.out.println("\nChon cach giai:");
        System.out.println("1. Vertical Scanning");
        System.out.println("2. Horizontal Scanning");
        System.out.println("3. Sort");

        System.out.print("Lua chon: ");
        int choice = sc.nextInt();

        String result = "";

        switch (choice) {

            case 1:
                Solution14_1 s1 = new Solution14_1();
                result = s1.longestCommonPrefix1(strs);
                break;

            case 2:
                Solution14_2 s2 = new Solution14_2();
                result = s2.longestCommonPrefix2(strs);
                break;

            case 3:
                Solution14_3 s3 = new Solution14_3();
                result = s3.longestCommonPrefix3(strs);
                break;

            default:
                System.out.println("Lua chon khong hop le");
                return;
        }

        System.out.println("Longest Common Prefix: " + result);
    }
}
/*
TESTCASE MẪU

Input:
Nhap so luong chuoi: 3
Nhap cac chuoi:
flower
flow
flight

Chon cach giai:
1
2
3
Lua chon: 2

Output:
Longest Common Prefix: fl
*/
