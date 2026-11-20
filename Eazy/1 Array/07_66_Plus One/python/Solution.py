import sys


def solution(nums: list[int]) -> list[int]:
    for i in range(len(nums) - 1, -1, -1):
        if nums[i] < 9:
            nums[i] += 1
            return nums
        nums[i] = 0
    result = [0] * (len(nums) + 1)
    result[0] = 1
    return result


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    n = next(tokens)
    nums = [next(tokens) for _ in range(n)]
    print(*solution(nums))


if __name__ == "__main__":
    main()


# Input:
# 3
# 2 9 9
# Output:
# 3 0 0
#
# Input:
# 2
# 9 9
# Output:
# 1 0 0
#
# Input:
# 1
# 0
# Output:
# 1
