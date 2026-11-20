import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static List<Integer> solution(int[] nums1, int[] nums2) {
        int[] smaller = nums1.length <= nums2.length ? nums1 : nums2;
        int[] larger = nums1.length <= nums2.length ? nums2 : nums1;

        Map<Integer, Integer> counts = new HashMap<>();
        for (int value : smaller) {
            counts.merge(value, 1, Integer::sum);
        }

        List<Integer> result = new ArrayList<>();
        for (int value : larger) {
            int remaining = counts.getOrDefault(value, 0);
            if (remaining > 0) {
                result.add(value);
                counts.put(value, remaining - 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums1 = new int[scanner.nextInt()];
        int[] nums2 = new int[scanner.nextInt()];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = scanner.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = scanner.nextInt();
        }
        System.out.println(solution(nums1, nums2));
    }
}

/*
Input:
3 6
5 2 5
2 5 8 5 5 2
Output:
[2, 5, 5]

Input:
2 3
0 1000
3 4 5
Output:
[]

Input:
5 2
7 1 7 3 7
7 7
Output:
[7, 7]
*/
