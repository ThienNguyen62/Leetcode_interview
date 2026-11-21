import java.util.ArrayDeque;
import java.util.Deque;
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

    private static boolean mirrors(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        return left.value == right.value &&
               mirrors(left.left, right.right) &&
               mirrors(left.right, right.left);
    }

    public static boolean solution(TreeNode root) {
        return root == null || mirrors(root.left, root.right);
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
7 4 4 null 9 9 null
Output:
true

Input:
7 4 4 null 9 null 9
Output:
false

Input:
-7
Output:
true
*/
