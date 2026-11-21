import java.util.Scanner;

public class Solution {
    public static int solution(int[] nums) {
        int lowest = nums[0];
        int best = 0;
        for (int i = 1; i < nums.length; ++i) {
            best = Math.max(best, nums[i] - lowest);
            lowest = Math.min(lowest, nums[i]);
        }
        return best;
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
8 3 6 2 7
Output:
5

Input:
4
9 7 7 3
Output:
0

Input:
1
0
Output:
0
*/
