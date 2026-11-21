from __future__ import annotations

import sys
from collections import deque
from collections.abc import Iterator


class TreeNode:
    def __init__(self, value: int):
        self.value = value
        self.left: TreeNode | None = None
        self.right: TreeNode | None = None


def solution(root: TreeNode | None) -> bool:
    pending = []
    current = root
    previous = None
    while current is not None or pending:
        while current is not None:
            pending.append(current)
            current = current.left
        current = pending.pop()
        if previous is not None and current.value <= previous.value:
            return False
        previous = current
        current = current.right
    return True


def read_tree(tokens: Iterator[str]) -> TreeNode | None:
    def read_node() -> TreeNode | None:
        token = next(tokens, "null")
        return None if token == "null" else TreeNode(int(token))

    root = read_node()
    if root is None:
        return None
    pending = deque([root])
    while pending:
        node = pending.popleft()
        node.left = read_node()
        node.right = read_node()
        if node.left is not None:
            pending.append(node.left)
        if node.right is not None:
            pending.append(node.right)
    return root


def main() -> None:
    tokens = (token for line in sys.stdin for token in line.split())
    root = read_tree(tokens)
    print(str(solution(root)).lower())


if __name__ == "__main__":
    main()


# Input:
# 8 3 10 null null 6 12
# Output:
# false
#
# Input:
# 0 -2147483648 2147483647
# Output:
# true
#
# Input:
# 6 6 8
# Output:
# false
