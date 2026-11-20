import java.util.Scanner;
import java.util.StringJoiner;

public class Solution {
    public static void solution(int[] nums) {
        int write = 0;
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                if (read != write) {
                    nums[write] = nums[read];
                    nums[read] = 0;
                }
                write++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        solution(nums);
        StringJoiner output = new StringJoiner(" ");
        for (int value : nums) {
            output.add(Integer.toString(value));
        }
        System.out.println(output);
    }
}

/*
Input:
4
0 -2 0 5
Output:
-2 5 0 0

Input:
3
0 0 0
Output:
0 0 0

Input:
3
4 2 -1
Output:
4 2 -1
*/
