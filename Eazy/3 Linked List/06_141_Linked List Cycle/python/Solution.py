from __future__ import annotations

import sys
from collections.abc import Iterator


class ListNode:
    def __init__(self, value: int, next_node: ListNode | None = None):
        self.value = value
        self.next = next_node


def solution(head: ListNode | None) -> bool:
    slow = fast = head
    while fast is not None and fast.next is not None:
        slow = slow.next
        fast = fast.next.next
        if slow is fast:
            return True
    return False


def read_list(tokens: Iterator[int], count: int) -> list[ListNode]:
    nodes = [ListNode(next(tokens)) for _ in range(count)]
    for i in range(1, count):
        nodes[i - 1].next = nodes[i]
    return nodes


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    n = next(tokens)
    pos = next(tokens)
    nodes = read_list(tokens, n)
    head = nodes[0] if nodes else None

    if pos >= 0:
        nodes[-1].next = nodes[pos]
    print(str(solution(head)).lower())


if __name__ == "__main__":
    main()


# Input:
# 4 2
# 5 -1 8 2
# Output:
# true
#
# Input:
# 3 -1
# 4 4 4
# Output:
# false
#
# Input:
# 1 0
# 9
# Output:
# true
