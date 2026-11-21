# 121. Best Time to Buy and Sell Stock

[LeetCode problem](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

The array `prices` gives the stock price for each day. Choose a purchase day and a strictly later sale day to maximize profit from a single transaction. Return zero if no transaction is profitable.

## Example 1

```text
Input: prices = [7,1,5,3,6,4]
Output: 5
```

Buy at 1 and sell later at 6.

## Example 2

```text
Input: prices = [7,6,4,3,1]
Output: 0
```

Prices keep falling, so skip the transaction.

## Constraints

- `1 <= prices.length <= 10^5`
- `0 <= prices[i] <= 10^4`
