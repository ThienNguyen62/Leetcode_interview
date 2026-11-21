import sys


def solution(nums: list[int]) -> int:
    two_back = one_back = 0
    for money in nums:
        two_back, one_back = one_back, max(one_back, two_back + money)
    return one_back


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    n = next(tokens)
    nums = [next(tokens) for _ in range(n)]
    print(solution(nums))


if __name__ == "__main__":
    main()


# Input:
# 4
# 4 1 1 9
# Output:
# 13
#
# Input:
# 1
# 0
# Output:
# 0
#
# Input:
# 3
# 8 10 8
# Output:
# 16
