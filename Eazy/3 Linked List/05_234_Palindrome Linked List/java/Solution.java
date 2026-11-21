import java.util.Scanner;

public class Solution {
    public static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static boolean solution(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = reverse(slow.next);
        boolean matches = true;
        for (ListNode left = head, right = second; right != null; right = right.next) {
            if (left.value != right.value) {
                matches = false;
                break;
            }
            left = left.next;
        }
        slow.next = reverse(second);
        return matches;
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
        ListNode[] nodes = readList(scanner, n);
        ListNode head = n == 0 ? null : nodes[0];

        System.out.println(solution(head));
    }
}

/*
Input:
5
3 7 0 7 3
Output:
true

Input:
4
4 5 5 6
Output:
false

Input:
1
8
Output:
true
*/
