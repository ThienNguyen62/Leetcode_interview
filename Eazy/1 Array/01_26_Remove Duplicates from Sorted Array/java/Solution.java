import java.util.Scanner;
import java.util.StringJoiner;

public class Solution {
    static int solution(int[] nums) {
        if (nums.length==0)
            return 0;
        int write = 1;
        for (int read = 1; read < nums.length; read++) {
            if (nums[read] != nums[write - 1]) {
                nums[write] = nums[read];
                write++;
            }
        }
        return write;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = solution(nums);
        StringJoiner prefix = new StringJoiner(" ");
        for (int i = 0; i < k; i++) {
            prefix.add(Integer.toString(nums[i]));
        }
        System.out.println(k);
        System.out.println(prefix);
    }
}

/*
Input:
6
-3 -3 -1 0 0 4
Output:
4
-3 -1 0 4

Input:
1
7
Output:
1
7

Input:
4
-2 -2 -2 -2
Output:
1
-2
*/
