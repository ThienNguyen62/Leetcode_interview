import sys


def solution(strs: list[str]) -> str:
    first = strs[0]
    for col, ch in enumerate(first):
        for row in range(1, len(strs)):
            if col == len(strs[row]) or strs[row][col] != ch:
                return first[:col]
    return first


def main() -> None:
    n = int(sys.stdin.readline())
    strs = [sys.stdin.readline().rstrip("\n") for _ in range(n)]
    print(solution(strs))


if __name__ == "__main__":
    main()


# Input:
# 3
# station
# stay
# stack
# Output:
# sta
#
# Input:
# 3
# ab
#
# abc
# Output:
#
#
# Input:
# 1
# alone
# Output:
# alone
