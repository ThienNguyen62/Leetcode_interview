import sys


def solution(nums: list[int]) -> int:
    result = 0
    for num in nums:
        result ^= num
    return result


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    n = next(tokens)
    nums = [next(tokens) for _ in range(n)]
    print(solution(nums))


if __name__ == "__main__":
    main()


# Input:
# 5
# 8 -3 8 2 2
# Output:
# -3
#
# Input:
# 1
# 30000
# Output:
# 30000
#
# Input:
# 5
# -7 12 0 -7 12
# Output:
# 0
