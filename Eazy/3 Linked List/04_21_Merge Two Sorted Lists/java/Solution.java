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

    public static ListNode solution(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (first != null && second != null) {
            if (first.value <= second.value) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }
        tail.next = first != null ? first : second;
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
        int m = scanner.nextInt();
        ListNode[] nodes = readList(scanner, n);
        ListNode head = n == 0 ? null : nodes[0];

        ListNode[] other = readList(scanner, m);
        ListNode second = m == 0 ? null : other[0];
        printList(solution(head, second));
    }
}

/*
Input:
3 3
-5 2 2
-3 2 7
Output:
-5 -3 2 2 2 7

Input:
0 2
-8 4
Output:
-8 4

Input:
2 0
1 5
Output:
1 5
*/
