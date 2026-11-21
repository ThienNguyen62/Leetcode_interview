from __future__ import annotations

import sys
from collections.abc import Iterator


class ListNode:
    def __init__(self, value: int, next_node: ListNode | None = None):
        self.value = value
        self.next = next_node


def reverse(head: ListNode | None) -> ListNode | None:
    prev = None
    while head is not None:
        next_node = head.next
        head.next = prev
        prev = head
        head = next_node
    return prev


def solution(head: ListNode | None) -> bool:
    if head is None:
        return True

    slow = fast = head
    while fast.next is not None and fast.next.next is not None:
        slow = slow.next
        fast = fast.next.next

    second = reverse(slow.next)
    matches = True
    left, right = head, second
    while right is not None:
        if left.value != right.value:
            matches = False
            break
        left = left.next
        right = right.next
    slow.next = reverse(second)
    return matches


def read_list(tokens: Iterator[int], count: int) -> list[ListNode]:
    nodes = [ListNode(next(tokens)) for _ in range(count)]
    for i in range(1, count):
        nodes[i - 1].next = nodes[i]
    return nodes


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    n = next(tokens)
    nodes = read_list(tokens, n)
    head = nodes[0] if nodes else None

    print(str(solution(head)).lower())


if __name__ == "__main__":
    main()


# Input:
# 5
# 3 7 0 7 3
# Output:
# true
#
# Input:
# 4
# 4 5 5 6
# Output:
# false
#
# Input:
# 1
# 8
# Output:
# true
