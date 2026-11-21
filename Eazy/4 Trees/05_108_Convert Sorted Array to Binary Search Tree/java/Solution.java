import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
        }
    }

    private static TreeNode build(int[] nums, int left, int right) {
        if (left == right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = build(nums, left, mid);
        node.right = build(nums, mid + 1, right);
        return node;
    }

    public static TreeNode solution(int[] nums) {
        return build(nums, 0, nums.length);
    }

    private static List<String> serialize(TreeNode root) {
        List<String> values = new ArrayList<>();
        Queue<TreeNode> pending = new LinkedList<>();
        pending.add(root);
        while (!pending.isEmpty()) {
            TreeNode node = pending.remove();
            if (node == null) {
                values.add("null");
                continue;
            }
            values.add(Integer.toString(node.value));
            pending.add(node.left);
            pending.add(node.right);
        }
        while (!values.isEmpty() && values.get(values.size() - 1).equals("null")) {
            values.remove(values.size() - 1);
        }
        return values;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(serialize(solution(nums)));
    }
}

/*
Input:
4
-6 -2 1 7
Output:
[1, -2, 7, -6]

Input:
1
-11
Output:
[-11]

Input:
2
-3 5
Output:
[5, -3]
*/
