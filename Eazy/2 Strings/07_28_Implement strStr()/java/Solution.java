import java.util.Scanner;

public class Solution {
    public static int solution(String haystack, String needle) {
        int m = needle.length();
        int[] lps = new int[m];
        for (int i = 1, matched = 0; i < m; ++i) {
            while (matched > 0 && needle.charAt(i) != needle.charAt(matched)) {
                matched = lps[matched - 1];
            }
            if (needle.charAt(i) == needle.charAt(matched)) {
                ++matched;
            }
            lps[i] = matched;
        }

        for (int i = 0, matched = 0; i < haystack.length(); ++i) {
            while (matched > 0 && haystack.charAt(i) != needle.charAt(matched)) {
                matched = lps[matched - 1];
            }
            if (haystack.charAt(i) == needle.charAt(matched)) {
                ++matched;
                if (matched == m) {
                    return i - m + 1;
                }
            }
        }
        return -1;
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
aaaaab
aaab
Output:
2

Input:
banana
ana
Output:
1

Input:
abc
abcd
Output:
-1
*/
