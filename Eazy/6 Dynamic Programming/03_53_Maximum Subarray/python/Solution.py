import sys


def solution(nums: list[int]) -> int:
    ending = best = nums[0]
    for i in range(1, len(nums)):
        ending = max(nums[i], ending + nums[i])
        best = max(best, ending)
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
# -4 2 -1 3 -7
# Output:
# 4
#
# Input:
# 4
# -8 -3 -6 -2
# Output:
# -2
#
# Input:
# 1
# 0
# Output:
# 0
