from __future__ import annotations

import sys
from collections import deque
from collections.abc import Iterator


class TreeNode:
    def __init__(self, value: int):
        self.value = value
        self.left: TreeNode | None = None
        self.right: TreeNode | None = None


def solution(root: TreeNode | None) -> list[list[int]]:
    if root is None:
        return []

    pending = deque([root])
    levels = []
    while pending:
        level = []
        for _ in range(len(pending)):
            node = pending.popleft()
            level.append(node.value)
            if node.left is not None:
                pending.append(node.left)
            if node.right is not None:
                pending.append(node.right)
        levels.append(level)
    return levels


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
    print(solution(root))


if __name__ == "__main__":
    main()


# Input:
# 8 2 9 null 5 6
# Output:
# [[8], [2, 9], [5, 6]]
#
# Input:
# -7
# Output:
# [[-7]]
#
# Input:
# 4 null 9 null 12
# Output:
# [[4], [9], [12]]
