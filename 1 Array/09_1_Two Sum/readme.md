# 1. Two Sum

[LeetCode problem](https://leetcode.com/problems/two-sum/)

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

## Example 1

```text
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
```

**Explanation:** Indices 0 and 1 give 2 + 7 = 9.

## Example 2

```text
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

**Explanation:** Indices 1 and 2 give 2 + 4 = 6.

## Example 3

```text
Input: nums = [3,3], target = 6
Output: [0,1]
```

**Explanation:** The two 3s occupy different positions.

## Constraints

- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Exactly one valid pair exists.

## Follow-up

Can you find the pair in less than quadratic time?
