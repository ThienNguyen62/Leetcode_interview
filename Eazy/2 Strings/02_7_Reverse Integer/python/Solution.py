import sys


def solution(x: int) -> int:
    result = 0
    while x != 0:
        quotient, remainder = divmod(x, 10)
        if x < 0 and remainder != 0:
            quotient += 1
            remainder -= 10
        if (
            result > 214748364 or (result == 214748364 and remainder > 7)
            or result < -214748364 or (result == -214748364 and remainder < -8)
        ):
            return 0
        result = result * 10 + remainder
        x = quotient
    return result


def main() -> None:
    print(solution(int(sys.stdin.readline())))


if __name__ == "__main__":
    main()


# Input:
# -1204
# Output:
# -4021
#
# Input:
# 1534236469
# Output:
# 0
#
# Input:
# -2147483412
# Output:
# -2143847412
