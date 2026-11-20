# 66. Plus One

[LeetCode problem](https://leetcode.com/problems/plus-one/)

A nonempty array `digits` represents a decimal integer, with the most significant digit first. The representation has no leading zeroes. Return the digit array for the integer plus one.

The only zero-only representation allowed is `[0]`.

## Example 1

```text
Input: digits = [1,2,3]
Output: [1,2,4]
```

**Explanation:** 123 becomes 124.

## Example 2

```text
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
```

**Explanation:** 4321 becomes 4322.

## Example 3

```text
Input: digits = [9]
Output: [1,0]
```

**Explanation:** Adding one to 9 produces two digits.

## Constraints

- `1 <= digits.length <= 100`
- `0 <= digits[i] <= 9`
