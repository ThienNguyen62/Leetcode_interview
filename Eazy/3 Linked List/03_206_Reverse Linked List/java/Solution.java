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

    public static ListNode solution(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
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
        ListNode[] nodes = readList(scanner, n);
        ListNode head = n == 0 ? null : nodes[0];

        printList(solution(head));
    }
}

/*
Input:
3
4 7 2
Output:
2 7 4

Input:
1
-6
Output:
-6

Input:
4
8 0 8 -3
Output:
-3 8 0 8
*/
