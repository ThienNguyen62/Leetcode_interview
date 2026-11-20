import sys
from collections import Counter


def solution(nums1: list[int], nums2: list[int]) -> list[int]:
    if len(nums1) > len(nums2):
        nums1, nums2 = nums2, nums1

    counts = Counter(nums1)
    result = []
    for value in nums2:
        if counts[value] > 0:
            result.append(value)
            counts[value] -= 1
    return result


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    m = next(tokens)
    n = next(tokens)
    nums1 = [next(tokens) for _ in range(m)]
    nums2 = [next(tokens) for _ in range(n)]
    print(solution(nums1, nums2))


if __name__ == "__main__":
    main()


# Input:
# 3 6
# 5 2 5
# 2 5 8 5 5 2
# Output:
# [2, 5, 5]
#
# Input:
# 2 3
# 0 1000
# 3 4 5
# Output:
# []
#
# Input:
# 5 2
# 7 1 7 3 7
# 7 7
# Output:
# [7, 7]
