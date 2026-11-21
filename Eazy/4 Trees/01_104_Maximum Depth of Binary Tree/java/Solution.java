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

    public static int solution(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<TreeNode> pending = new ArrayDeque<>();
        pending.addLast(root);
        int depth = 0;
        while (!pending.isEmpty()) {
            for (int remaining = pending.size(); remaining > 0; remaining--) {
                TreeNode node = pending.removeFirst();
                if (node.left != null) {
                    pending.addLast(node.left);
                }
                if (node.right != null) {
                    pending.addLast(node.right);
                }
            }
            depth++;
        }
        return depth;
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
8 4 9 null 6 null null 5
Output:
4

Input:
null
Output:
0

Input:
-2 -3 0
Output:
2
*/
