import sys


def solution(nums: list[int]) -> None:
    write = 0
    for read, value in enumerate(nums):
        if value != 0:
            if read != write:
                nums[write], nums[read] = nums[read], nums[write]
            write += 1


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    n = next(tokens)
    nums = [next(tokens) for _ in range(n)]
    solution(nums)
    print(*nums)


if __name__ == "__main__":
    main()


# Input:
# 4
# 0 -2 0 5
# Output:
# -2 5 0 0
#
# Input:
# 3
# 0 0 0
# Output:
# 0 0 0
#
# Input:
# 3
# 4 2 -1
# Output:
# 4 2 -1
