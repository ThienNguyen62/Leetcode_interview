import sys


def solution(nums: list[int]) -> bool:
    seen = set()
    for num in nums:
        if num in seen:
            return True
        seen.add(num)
    return False


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    n = next(tokens)
    nums = [next(tokens) for _ in range(n)]
    print(str(solution(nums)).lower())


if __name__ == "__main__":
    main()


# Input:
# 5
# -4 6 0 9 -4
# Output:
# true
#
# Input:
# 1
# -1000000000
# Output:
# false
#
# Input:
# 4
# 1000000000 0 -5 7
# Output:
# false
