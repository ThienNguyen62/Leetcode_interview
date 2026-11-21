import java.util.Scanner;

public class Solution {
    public static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    public static boolean solution(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int pos = scanner.nextInt();
        ListNode[] nodes = readList(scanner, n);
        ListNode head = n == 0 ? null : nodes[0];

        if (pos >= 0) {
            nodes[n - 1].next = nodes[pos];
        }
        System.out.println(solution(head));
    }
}

/*
Input:
4 2
5 -1 8 2
Output:
true

Input:
3 -1
4 4 4
Output:
false

Input:
1 0
9
Output:
true
*/
