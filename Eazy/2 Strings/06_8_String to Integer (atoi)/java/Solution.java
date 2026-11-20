import java.util.Scanner;

public class Solution {
    public static int solution(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            ++i;
        }

        boolean negative = false;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            negative = s.charAt(i) == '-';
            ++i;
        }

        int value = 0;
        int lastDigit = negative ? 8 : 7;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';
            if (value < Integer.MIN_VALUE / 10 || (value == Integer.MIN_VALUE / 10 && digit > lastDigit)) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            value = value * 10 - digit;
            ++i;
        }
        return negative ? value : -value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(solution(s));
    }
}

/*
Input:
  -0012x3
Output:
-12

Input:
2147483648
Output:
2147483647

Input:
-2147483649
Output:
-2147483648
*/
