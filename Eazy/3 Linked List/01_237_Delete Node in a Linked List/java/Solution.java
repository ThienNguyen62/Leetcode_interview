import java.util.Scanner;
import java.util.StringJoiner;

public class Solution {
    public static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    public static void solution(ListNode node) {
        ListNode successor = node.next;
        node.value = successor.value;
        node.next = successor.next;
    }

    private static ListNode[] readList(Scanner scanner, int count) {
        ListNode[] nodes = new ListNode[count];
        for (int i = 0; i < count; i++) {
            nodes[i] = new ListNode(scanner.nextInt());
            if (i > 0) {
                nodes[i - 1].next = nodes[i];
            }
        }
        return nodes;
    }

    private static void printList(ListNode head) {
        StringJoiner output = new StringJoiner(" ");
        for (ListNode node = head; node != null; node = node.next) {
            output.add(Integer.toString(node.value));
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        ListNode[] nodes = readList(scanner, n);
        ListNode head = n == 0 ? null : nodes[0];

        ListNode targetNode = head;
        while (targetNode.value != target) {
            targetNode = targetNode.next;
        }
        solution(targetNode);
        printList(head);
    }
}

/*
Input:
4 3
8 3 6 2
Output:
8 6 2

Input:
2 -4
-4 9
Output:
9

Input:
4 10
1 5 10 0
Output:
1 5 0
*/
