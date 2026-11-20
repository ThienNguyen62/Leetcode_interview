import sys


def solution(s: str) -> int:
    counts = [0] * 26
    for ch in s:
        counts[ord(ch) - ord("a")] += 1
    for i, ch in enumerate(s):
        if counts[ord(ch) - ord("a")] == 1:
            return i
    return -1


def main() -> None:
    s = sys.stdin.readline().rstrip("\n")
    print(solution(s))


if __name__ == "__main__":
    main()


# Input:
# swiss
# Output:
# 1
#
# Input:
# zz
# Output:
# -1
#
# Input:
# q
# Output:
# 0
