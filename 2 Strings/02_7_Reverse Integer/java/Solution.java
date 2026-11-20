import java.util.Scanner;

public class Solution {
    public static int solution(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7) ||
                result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            result = result * 10 + digit;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution(scanner.nextInt()));
    }
}

/*
Input:
-1204
Output:
-4021

Input:
1534236469
Output:
0

Input:
-2147483412
Output:
-2143847412
*/
