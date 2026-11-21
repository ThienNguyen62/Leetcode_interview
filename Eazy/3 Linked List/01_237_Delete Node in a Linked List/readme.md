# 237. Delete Node in a Linked List

[LeetCode problem](https://leetcode.com/problems/delete-node-in-a-linked-list/)

Remove a specified node from a singly linked list when the function receives only that node and has no head reference. The given node has a successor. Afterward its original value must be absent, the list must have one fewer node, and all other values must keep their relative order. The test harness builds the list and passes the reference identified by the supplied value.

## Example 1

```text
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
```

## Example 2

```text
Input: head = [4,5,1,9], node = 1
Output: [4,5,9]
```

## Constraints

- The list contains 2 to 1000 nodes.
- `-1000 <= Node.val <= 1000`
- Values are distinct. The target belongs to the list and is never the tail.
