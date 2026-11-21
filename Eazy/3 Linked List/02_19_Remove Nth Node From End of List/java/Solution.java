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

    public static ListNode solution(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        for (int i = 0; i < k; ++i) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
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
        int k = scanner.nextInt();
        ListNode[] nodes = readList(scanner, n);
        ListNode head = n == 0 ? null : nodes[0];

        printList(solution(head, k));
    }
}

/*
Input:
4 2
8 4 6 2
Output:
8 4 2

Input:
3 3
0 9 4
Output:
9 4

Input:
3 1
7 7 5
Output:
7 7
*/
