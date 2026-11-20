import java.util.Scanner;

public class Solution {
    public static int solution(String s) {
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (counts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(solution(s));
    }
}

/*
Input:
swiss
Output:
1

Input:
zz
Output:
-1

Input:
q
Output:
0
*/
