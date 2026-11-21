# 21. Merge Two Sorted Lists

[LeetCode problem](https://leetcode.com/problems/merge-two-sorted-lists/)

Given the heads of two nondecreasing singly linked lists, splice their existing nodes into one nondecreasing list and return its head.

## Example 1

```text
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
```

## Example 2

```text
Input: list1 = [], list2 = []
Output: []
```

## Example 3

```text
Input: list1 = [], list2 = [0]
Output: [0]
```

## Constraints

- Each list contains 0 to 50 nodes.
- `-100 <= Node.val <= 100`
- Both input lists are sorted in nondecreasing order.
