import sys


def solution(s: list[str]) -> None:
    left, right = 0, len(s) - 1
    while left < right:
        s[left], s[right] = s[right], s[left]
        left += 1
        right -= 1


def main() -> None:
    s = list(sys.stdin.readline().rstrip("\n"))
    solution(s)
    print("".join(s))


if __name__ == "__main__":
    main()


# Input:
# Ab!?
# Output:
# ?!bA
#
# Input:
# x
# Output:
# x
#
# Input:
# a b
# Output:
# b a
