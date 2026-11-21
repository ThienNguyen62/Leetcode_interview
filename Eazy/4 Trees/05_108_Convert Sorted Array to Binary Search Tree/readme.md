# 108. Convert Sorted Array to Binary Search Tree

[LeetCode problem](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)

Build a height-balanced binary search tree from the strictly increasing array `nums`. At each node, the subtree heights may differ by at most one. Any valid tree is accepted.

## Example 1

```text
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
```

## Example 2

```text
Input: nums = [1,3]
Output: [3,1]
```

The tree [1,null,3] also meets the requirements.

## Constraints

- `1 <= nums.length <= 10^4`
- `-10^4 <= nums[i] <= 10^4`
- Values are strictly increasing.
