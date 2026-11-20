# 8. String to Integer (atoi)

[LeetCode problem](https://leetcode.com/problems/string-to-integer-atoi/)

Implement `myAtoi(s)` to parse a signed 32-bit integer. Skip initial spaces, consume at most one sign (`+` or `-`), then read consecutive decimal digits. Without a sign, the value is positive. Leading zeroes add no value. Stop at the first non-digit and return 0 if no digits were read. Clamp results below -2^31 or above 2^31 - 1 to the corresponding boundary.

## Example 1

```text
Input: s = "42"
Output: 42
```

**Explanation:** Read 42 directly.

## Example 2

```text
Input: s = " -042"
Output: -42
```

**Explanation:** Skip the initial space, consume the minus sign and parse 042.

## Example 3

```text
Input: s = "1337c0d3"
Output: 1337
```

**Explanation:** Parsing stops at c.

## Example 4

```text
Input: s = "0-1"
Output: 0
```

**Explanation:** Parsing stops at the minus sign after the first digit.

## Example 5

```text
Input: s = "words and 987"
Output: 0
```

**Explanation:** The first character is not a digit, so no digits are read.

## Constraints

- `0 <= s.length <= 200`
- Only English letters, ASCII digits, spaces, '+', '-' and '.' appear.
