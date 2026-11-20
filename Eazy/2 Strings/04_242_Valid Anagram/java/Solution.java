import java.util.Scanner;

public class Solution {
    public static boolean solution(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (--counts[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(solution(s, t));
    }
}

/*
Input:
aabc
baca
Output:
true

Input:
aabc
abcc
Output:
false

Input:
z
zz
Output:
false
*/
