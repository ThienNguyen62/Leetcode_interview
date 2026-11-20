import java.util.Scanner;

public class Solution {
    public static boolean solution(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char a = s.charAt(left), b = s.charAt(right);
            if (!Character.isLetterOrDigit(a)) {
                left++;
            } else if (!Character.isLetterOrDigit(b)) {
                right--;
            } else {
                if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(solution(s));
    }
}

/*
Input:
Z!2-z
Output:
true

Input:
0P
Output:
false

Input:
...?
Output:
true
*/
