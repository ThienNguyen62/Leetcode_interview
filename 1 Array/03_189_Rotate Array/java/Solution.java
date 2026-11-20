import java.util.Scanner;
import java.util.StringJoiner;

public class Solution {
    public static void solution(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if (k == 0) {
            return;
        }

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        solution(nums, k);
        StringJoiner output = new StringJoiner(" ");
        for (int num : nums) {
            output.add(Integer.toString(num));
        }
        System.out.println(output);
    }
}

/*
Input:
5 2
8 2 6 1 3
Output:
1 3 8 2 6

Input:
4 6
-2 0 -2 9
Output:
-2 9 -2 0

Input:
3 0
4 4 -7
Output:
4 4 -7
*/
