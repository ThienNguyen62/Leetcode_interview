import java.util.Scanner;

public class Solution {
    public static String solution(String[] strs) {
        String first = strs[0];
        for (int col = 0; col < first.length(); col++) {
            for (int row = 1; row < strs.length; row++) {
                if (col == strs[row].length() || strs[row].charAt(col) != first.charAt(col)) {
                    return first.substring(0, col);
                }
            }
        }
        return first;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }
        System.out.println(solution(strs));
    }
}

/*
Input:
3
station
stay
stack
Output:
sta

Input:
3
ab

abc
Output:


Input:
1
alone
Output:
alone
*/
