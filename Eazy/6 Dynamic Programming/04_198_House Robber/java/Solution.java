import java.util.Scanner;

public class Solution {
    public static int solution(int[] nums) {
        int twoBack = 0;
        int oneBack = 0;
        for (int money : nums) {
            int current = Math.max(oneBack, twoBack + money);
            twoBack = oneBack;
            oneBack = current;
        }
        return oneBack;
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
4
4 1 1 9
Output:
13

Input:
1
0
Output:
0

Input:
3
8 10 8
Output:
16
*/
