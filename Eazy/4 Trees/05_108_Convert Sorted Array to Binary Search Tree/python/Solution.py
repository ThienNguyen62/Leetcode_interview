from __future__ import annotations

import sys
from collections import deque


class TreeNode:
    def __init__(self, value: int):
        self.value = value
        self.left: TreeNode | None = None
        self.right: TreeNode | None = None


def solution(nums: list[int]) -> TreeNode | None:
    def build(left: int, right: int) -> TreeNode | None:
        if left == right:
            return None
        mid = left + (right - left) // 2
        node = TreeNode(nums[mid])
        node.left = build(left, mid)
        node.right = build(mid + 1, right)
        return node

    return build(0, len(nums))


def serialize(root: TreeNode | None) -> str:
    values = []
    pending = deque([root])
    while pending:
        node = pending.popleft()
        if node is None:
            values.append("null")
            continue
        values.append(str(node.value))
        pending.append(node.left)
        pending.append(node.right)
    while values and values[-1] == "null":
        values.pop()
    return "[" + ", ".join(values) + "]"


def main() -> None:
    tokens = (token for line in sys.stdin for token in line.split())
    n = int(next(tokens))
    nums = [int(next(tokens)) for _ in range(n)]
    print(serialize(solution(nums)))


if __name__ == "__main__":
    main()


# Input:
# 4
# -6 -2 1 7
# Output:
# [1, -2, 7, -6]
#
# Input:
# 1
# -11
# Output:
# [-11]
#
# Input:
# 2
# -3 5
# Output:
# [5, -3]
