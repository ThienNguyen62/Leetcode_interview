from __future__ import annotations

import sys
from collections import deque
from collections.abc import Iterator


class TreeNode:
    def __init__(self, value: int):
        self.value = value
        self.left: TreeNode | None = None
        self.right: TreeNode | None = None


def mirrors(left: TreeNode | None, right: TreeNode | None) -> bool:
    if left is None or right is None:
        return left is right
    return (
        left.value == right.value
        and mirrors(left.left, right.right)
        and mirrors(left.right, right.left)
    )


def solution(root: TreeNode | None) -> bool:
    return root is None or mirrors(root.left, root.right)


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
# 7 4 4 null 9 9 null
# Output:
# true
#
# Input:
# 7 4 4 null 9 null 9
# Output:
# false
#
# Input:
# -7
# Output:
# true
