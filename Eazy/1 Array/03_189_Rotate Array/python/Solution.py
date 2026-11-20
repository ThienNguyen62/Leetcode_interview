import sys


def solution(nums: list[int], k: int) -> None:
    n = len(nums)
    k %= n
    if k == 0:
        return

    def reverse(left: int, right: int) -> None:
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1

    nums.reverse()
    reverse(0, k - 1)
    reverse(k, n - 1)


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    n = next(tokens)
    k = next(tokens)
    nums = [next(tokens) for _ in range(n)]

    solution(nums, k)
    print(" ".join(map(str, nums)))


if __name__ == "__main__":
    main()


# Input:
# 5 2
# 8 2 6 1 3
# Output:
# 1 3 8 2 6
#
# Input:
# 4 6
# -2 0 -2 9
# Output:
# -2 9 -2 0
#
# Input:
# 3 0
# 4 4 -7
# Output:
# 4 4 -7
