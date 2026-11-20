import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static boolean solution(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
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
-4 6 0 9 -4
Output:
true

Input:
1
-1000000000
Output:
false

Input:
4
1000000000 0 -5 7
Output:
false
*/
