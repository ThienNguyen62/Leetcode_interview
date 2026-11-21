from __future__ import annotations

import sys
from collections.abc import Iterator


class ListNode:
    def __init__(self, value: int, next_node: ListNode | None = None):
        self.value = value
        self.next = next_node


def solution(head: ListNode | None) -> ListNode | None:
    prev = None
    while head is not None:
        next_node = head.next
        head.next = prev
        prev = head
        head = next_node
    return prev


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
    nodes = read_list(tokens, n)
    head = nodes[0] if nodes else None

    print_list(solution(head))


if __name__ == "__main__":
    main()


# Input:
# 3
# 4 7 2
# Output:
# 2 7 4
#
# Input:
# 1
# -6
# Output:
# -6
#
# Input:
# 4
# 8 0 8 -3
# Output:
# -3 8 0 8
