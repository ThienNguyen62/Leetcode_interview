# 98. Validate Binary Search Tree

[LeetCode problem](https://leetcode.com/problems/validate-binary-search-tree/)

Check whether every node has only smaller values throughout its left subtree and only larger values throughout its right subtree, with the same rule applied recursively to both subtrees.

## Example 1

```text
Input: root = [2,1,3]
Output: true
```

## Example 2

```text
Input: root = [5,1,4,null,null,3,6]
Output: false
```

The value 3 belongs to the right subtree of 5, so it must be greater than 5.

## Constraints

- The tree contains 1 to 10^4 nodes.
- `-2^31 <= Node.val <= 2^31 - 1`
