import sys


def solution(nums: list[int], target: int) -> list[int]:
    seen = {}
    for i, value in enumerate(nums):
        complement = target - value
        if complement in seen:
            return [seen[complement], i]
        seen[value] = i
    return []


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    n = next(tokens)
    target = next(tokens)
    nums = [next(tokens) for _ in range(n)]
    print(*solution(nums, target))


if __name__ == "__main__":
    main()


# Input:
# 4 5
# 4 -2 7 1
# Output:
# 1 2
#
# Input:
# 2 10
# 5 5
# Output:
# 0 1
#
# Input:
# 3 -8
# 0 -3 -5
# Output:
# 1 2
