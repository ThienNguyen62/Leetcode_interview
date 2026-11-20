import sys


def solution(s: str) -> int:
    i = 0
    while i < len(s) and s[i] == " ":
        i += 1

    negative = False
    if i < len(s) and s[i] in "+-":
        negative = s[i] == "-"
        i += 1

    value = 0
    last_digit = 8 if negative else 7
    while i < len(s) and "0" <= s[i] <= "9":
        digit = ord(s[i]) - ord("0")
        if value < -214748364 or (value == -214748364 and digit > last_digit):
            return -2147483648 if negative else 2147483647
        value = value * 10 - digit
        i += 1
    return value if negative else -value


def main() -> None:
    s = sys.stdin.readline().rstrip("\n")
    print(solution(s))


if __name__ == "__main__":
    main()


# Input:
#   -0012x3
# Output:
# -12
#
# Input:
# 2147483648
# Output:
# 2147483647
#
# Input:
# -2147483649
# Output:
# -2147483648
