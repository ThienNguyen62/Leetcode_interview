import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
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

    public static List<List<Integer>> solution(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) {
            return levels;
        }
        Deque<TreeNode> pending = new ArrayDeque<>();
        pending.addLast(root);
        while (!pending.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            for (int remaining = pending.size(); remaining > 0; remaining--) {
                TreeNode node = pending.removeFirst();
                level.add(node.value);
                if (node.left != null) {
                    pending.addLast(node.left);
                }
                if (node.right != null) {
                    pending.addLast(node.right);
                }
            }
            levels.add(level);
        }
        return levels;
    }

    private static TreeNode readNode(Scanner scanner) {
        if (!scanner.hasNext()) {
            return null;
        }
        String token = scanner.next();
        return token.equals("null") ? null : new TreeNode(Integer.parseInt(token));
    }

    private static TreeNode readTree(Scanner scanner) {
        TreeNode root = readNode(scanner);
        if (root == null) {
            return null;
        }
        Deque<TreeNode> pending = new ArrayDeque<>();
        pending.addLast(root);
        while (!pending.isEmpty() && scanner.hasNext()) {
            TreeNode node = pending.removeFirst();
            node.left = readNode(scanner);
            node.right = readNode(scanner);
            if (node.left != null) {
                pending.addLast(node.left);
            }
            if (node.right != null) {
                pending.addLast(node.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution(readTree(scanner)));
    }
}

/*
Input:
8 2 9 null 5 6
Output:
[[8], [2, 9], [5, 6]]

Input:
-7
Output:
[[-7]]

Input:
4 null 9 null 12
Output:
[[4], [9], [12]]
*/
