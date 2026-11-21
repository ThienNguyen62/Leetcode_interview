# 141. Linked List Cycle

[LeetCode problem](https://leetcode.com/problems/linked-list-cycle/)

Return whether following next references from head can reach the same node twice. In test data, pos is the zero-based index that the tail points to, or -1 for an ordinary terminated list. The algorithm receives only head.

## Example 1

```text
Input: head = [3,2,0,-4], pos = 1
Output: true
```

The tail links back to index 1.

## Example 2

```text
Input: head = [1,2], pos = 0
Output: true
```

The tail links back to the head.

## Example 3

```text
Input: head = [1], pos = -1
Output: false
```

The tail points to null.

## Constraints

- The list contains 0 to 10^4 nodes.
- `-10^5 <= Node.val <= 10^5`
- pos is -1 or a valid zero-based index.

## Follow-up

Can you detect a cycle with constant auxiliary space?
