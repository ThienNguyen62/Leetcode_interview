# 19. Remove Nth Node From End of List

[LeetCode problem](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

Delete the node that is n positions from the end of the singly linked list, counting the tail as position 1. Return the head of the resulting list.

## Example 1

```text
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
```

## Example 2

```text
Input: head = [1], n = 1
Output: []
```

## Example 3

```text
Input: head = [1,2], n = 1
Output: [1]
```

## Constraints

- Let sz be the list length.
- `1 <= sz <= 30`
- `0 <= Node.val <= 100`
- `1 <= n <= sz`

## Follow-up

Can you solve it in one pass?
