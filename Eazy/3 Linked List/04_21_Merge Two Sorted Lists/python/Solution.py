from __future__ import annotations

import sys
from collections.abc import Iterator


class ListNode:
    def __init__(self, value: int, next_node: ListNode | None = None):
        self.value = value
        self.next = next_node


def solution(first: ListNode | None, second: ListNode | None) -> ListNode | None:
    dummy = ListNode(0)
    tail = dummy
    while first is not None and second is not None:
        if first.value <= second.value:
            tail.next = first
            first = first.next
        else:
            tail.next = second
            second = second.next
        tail = tail.next
    tail.next = first if first is not None else second
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
    m = next(tokens)
    nodes = read_list(tokens, n)
    head = nodes[0] if nodes else None

    other = read_list(tokens, m)
    second = other[0] if other else None
    print_list(solution(head, second))


if __name__ == "__main__":
    main()


# Input:
# 3 3
# -5 2 2
# -3 2 7
# Output:
# -5 -3 2 2 2 7
#
# Input:
# 0 2
# -8 4
# Output:
# -8 4
#
# Input:
# 2 0
# 1 5
# Output:
# 1 5
