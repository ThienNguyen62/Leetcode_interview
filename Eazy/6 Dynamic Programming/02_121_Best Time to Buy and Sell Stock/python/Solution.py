import sys


def solution(nums: list[int]) -> int:
    lowest = nums[0]
    best = 0
    for i in range(1, len(nums)):
        best = max(best, nums[i] - lowest)
        lowest = min(lowest, nums[i])
    return best


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    n = next(tokens)
    nums = [next(tokens) for _ in range(n)]
    print(solution(nums))


if __name__ == "__main__":
    main()


# Input:
# 5
# 8 3 6 2 7
# Output:
# 5
#
# Input:
# 4
# 9 7 7 3
# Output:
# 0
#
# Input:
# 1
# 0
# Output:
# 0
