# 53. Maximum Subarray

[LeetCode problem](https://leetcode.com/problems/maximum-subarray/)

Find the largest sum among all nonempty contiguous segments of the integer array `nums`. Return the sum.

## Example 1

```text
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
```

The segment [4,-1,2,1] sums to 6.

## Example 2

```text
Input: nums = [1]
Output: 1
```

## Example 3

```text
Input: nums = [5,4,-1,7,8]
Output: 23
```

The full array is optimal.

## Constraints

- `1 <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4`

## Follow-up

After finding a linear-time solution, try a divide-and-conquer approach.
