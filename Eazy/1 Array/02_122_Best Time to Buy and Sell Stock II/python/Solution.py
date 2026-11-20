import sys


def solution(prices: list[int]) -> int:
    profit = 0
    for day in range(1, len(prices)):
        increase = prices[day] - prices[day - 1]
        if increase > 0:
            profit += increase
    return profit


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    days = next(tokens)
    prices = [next(tokens) for _ in range(days)]
    print(solution(prices))


if __name__ == "__main__":
    main()


# Input:
# 5
# 2 5 1 4 4
# Output:
# 6
#
# Input:
# 1
# 8
# Output:
# 0
#
# Input:
# 5
# 9 7 7 3 0
# Output:
# 0
