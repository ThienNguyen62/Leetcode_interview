from __future__ import annotations

import sys
from collections.abc import Iterator


class ListNode:
    def __init__(self, value: int, next_node: ListNode | None = None):
        self.value = value
        self.next = next_node


def solution(head: ListNode, k: int) -> ListNode | None:
    dummy = ListNode(0, head)
    fast = slow = dummy
    for _ in range(k):
        fast = fast.next
    while fast.next is not None:
        fast = fast.next
        slow = slow.next
    slow.next = slow.next.next
    return dummy.next


def read_list(tokens: Iterator[int], count: int) -> list[ListNode]:
    nodes = [ListNode(next(tokens)) for _ in range(count)]
    for i in range(1, count):
        nodes[i - 1].next = nodes[i]
    return nodes


def print_list(head: ListNode | None) -> None:
    values = []
    while head is not None:
        values.append(str(head.value))
        head = head.next
    print(" ".join(values))


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    n = next(tokens)
    k = next(tokens)
    nodes = read_list(tokens, n)
    head = nodes[0] if nodes else None

    print_list(solution(head, k))


if __name__ == "__main__":
    main()


# Input:
# 4 2
# 8 4 6 2
# Output:
# 8 4 2
#
# Input:
# 3 3
# 0 9 4
# Output:
# 9 4
#
# Input:
# 3 1
# 7 7 5
# Output:
# 7 7
