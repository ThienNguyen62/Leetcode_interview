# 28. Find the Index of the First Occurrence in a String

[LeetCode problem](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

Return the smallest zero-based index in `haystack` at which the whole string `needle` occurs. Return -1 when no occurrence exists.

## Example 1

```text
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
```

**Explanation:** Matches begin at 0 and 6. The earliest is 0.

## Example 2

```text
Input: haystack = "leetcode", needle = "leeto"
Output: -1
```

**Explanation:** There is no match.

## Constraints

- `1 <= haystack.length, needle.length <= 10^4`
- Both strings use lowercase English letters.
