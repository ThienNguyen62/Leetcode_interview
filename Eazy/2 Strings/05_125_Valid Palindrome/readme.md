# 125. Valid Palindrome

[LeetCode problem](https://leetcode.com/problems/valid-palindrome/)

Ignore punctuation, spaces and any other characters outside ASCII letters and digits. Compare the remaining characters without regard to letter case. Return whether the sequence is the same in either direction.

## Example 1

```text
Input: s = "A man, a plan, a canal: Panama"
Output: true
```

**Explanation:** The retained characters form amanaplanacanalpanama.

## Example 2

```text
Input: s = "race a car"
Output: false
```

**Explanation:** The retained sequence is raceacar.

## Example 3

```text
Input: s = " "
Output: true
```

**Explanation:** The retained sequence is empty.

## Constraints

- `1 <= s.length <= 2 * 10^5`
- The string contains only printable ASCII.
