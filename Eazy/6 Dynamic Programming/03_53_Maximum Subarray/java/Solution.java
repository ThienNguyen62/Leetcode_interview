import java.util.Scanner;

public class Solution {
    public static int solution(int[] nums) {
        int ending = nums[0];
        int best = ending;
        for (int i = 1; i < nums.length; ++i) {
            ending = Math.max(nums[i], ending + nums[i]);
            best = Math.max(best, ending);
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
-4 2 -1 3 -7
Output:
4

Input:
4
-8 -3 -6 -2
Output:
-2

Input:
1
0
Output:
0
*/
