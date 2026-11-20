# 189. Rotate Array

[LeetCode problem](https://leetcode.com/problems/rotate-array/)

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

## Example 1

```text
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
```

**Explanation:** The arrays after one, two, and three right shifts are `[7,1,2,3,4,5,6]`, `[6,7,1,2,3,4,5]`, and `[5,6,7,1,2,3,4]`.

## Example 2

```text
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
```

**Explanation:** The first shift gives `[99,-1,-100,3]`. The second gives `[3,99,-1,-100]`.

## Constraints

- `1 <= nums.length <= 10^5`
- `-2^31 <= nums[i] <= 2^31 - 1`
- `0 <= k <= 10^5`

## Follow-up

Try to find at least three approaches. Can you rotate the array in place using O(1) extra space?
