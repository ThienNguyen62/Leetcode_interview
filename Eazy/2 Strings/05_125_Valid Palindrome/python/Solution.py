import sys


def solution(s: str) -> bool:
    left, right = 0, len(s) - 1
    while left < right:
        if not s[left].isalnum():
            left += 1
        elif not s[right].isalnum():
            right -= 1
        else:
            if s[left].lower() != s[right].lower():
                return False
            left += 1
            right -= 1
    return True


def main() -> None:
    s = sys.stdin.readline().rstrip("\n")
    print(str(solution(s)).lower())


if __name__ == "__main__":
    main()


# Input:
# Z!2-z
# Output:
# true
#
# Input:
# 0P
# Output:
# false
#
# Input:
# ...?
# Output:
# true
