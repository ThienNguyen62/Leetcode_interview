import sys


def solution(n: int) -> int:
    previous = current = 1
    for _ in range(2, n + 1):
        previous, current = current, previous + current
    return current


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    n = next(tokens)
    print(solution(n))


if __name__ == "__main__":
    main()


# Input:
# 4
# Output:
# 5
#
# Input:
# 1
# Output:
# 1
#
# Input:
# 45
# Output:
# 1836311903
