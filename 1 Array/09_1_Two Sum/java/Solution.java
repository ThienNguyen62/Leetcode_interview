import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Solution {
    public static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer match = seen.get(target - nums[i]);
            if (match != null) {
                return new int[] {match, i};
            }
            seen.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] result = solution(nums, target);
        StringJoiner output = new StringJoiner(" ");
        for (int value : result) {
            output.add(Integer.toString(value));
        }
        System.out.println(output);
    }
}

/*
Input:
4 5
4 -2 7 1
Output:
1 2

Input:
2 10
5 5
Output:
0 1

Input:
3 -8
0 -3 -5
Output:
1 2
*/
