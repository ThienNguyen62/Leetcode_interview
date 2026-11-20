import sys


def solution(matrix: list[list[int]]) -> None:
    n = len(matrix)
    for row in range(n):
        for col in range(row + 1, n):
            matrix[row][col], matrix[col][row] = matrix[col][row], matrix[row][col]
    for row in matrix:
        row.reverse()


def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    n = next(tokens)
    matrix = [[next(tokens) for _ in range(n)] for _ in range(n)]
    solution(matrix)
    for row in matrix:
        print(*row)


if __name__ == "__main__":
    main()


# Input:
# 2
# 8 3
# 2 -1
# Output:
# 2 8
# -1 3
#
# Input:
# 1
# -7
# Output:
# -7
#
# Input:
# 3
# 0 1 2
# 3 4 5
# 6 7 8
# Output:
# 6 3 0
# 7 4 1
# 8 5 2
