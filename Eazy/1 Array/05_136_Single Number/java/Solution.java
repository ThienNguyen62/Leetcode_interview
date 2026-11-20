import java.util.Scanner;

public class Solution {
    public static int solution(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(solution(nums));
    }
}

/*
Input:
5
8 -3 8 2 2
Output:
-3

Input:
1
30000
Output:
30000

Input:
5
-7 12 0 -7 12
Output:
0
*/
