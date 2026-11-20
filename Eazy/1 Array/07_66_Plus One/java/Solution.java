import java.util.Scanner;
import java.util.StringJoiner;

public class Solution {
    public static int[] solution(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int[] result = new int[nums.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] result = solution(nums);
        StringJoiner output = new StringJoiner(" ");
        for (int value : result) {
            output.add(Integer.toString(value));
        }
        System.out.println(output);
    }
}

/*
Input:
3
2 9 9
Output:
3 0 0

Input:
2
9 9
Output:
1 0 0

Input:
1
0
Output:
1
*/
