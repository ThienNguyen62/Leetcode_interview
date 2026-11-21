from __future__ import annotations

import sys
from collections.abc import Iterator


class ListNode:
    def __init__(self, value: int, next_node: ListNode | None = None):
        self.value = value
        self.next = next_node


def solution(node: ListNode) -> None:
    successor = node.next
    node.value = successor.value
    node.next = successor.next


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
    target = next(tokens)
    nodes = read_list(tokens, n)
    head = nodes[0] if nodes else None

    target_node = head
    while target_node.value != target:
        target_node = target_node.next
    solution(target_node)
    print_list(head)


if __name__ == "__main__":
    main()


# Input:
# 4 3
# 8 3 6 2
# Output:
# 8 6 2
#
# Input:
# 2 -4
# -4 9
# Output:
# 9
#
# Input:
# 4 10
# 1 5 10 0
# Output:
# 1 5 0
