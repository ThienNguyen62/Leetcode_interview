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

    public static boolean solution(TreeNode root) {
        Deque<TreeNode> pending = new ArrayDeque<>();
        TreeNode current = root;
        TreeNode previous = null;
        while (current != null || !pending.isEmpty()) {
            while (current != null) {
                pending.push(current);
                current = current.left;
            }
            current = pending.pop();
            if (previous != null && current.value <= previous.value) {
                return false;
            }
            previous = current;
            current = current.right;
        }
        return true;
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
8 3 10 null null 6 12
Output:
false

Input:
0 -2147483648 2147483647
Output:
true

Input:
6 6 8
Output:
false
*/
