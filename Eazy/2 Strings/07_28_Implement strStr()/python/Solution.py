import sys


def solution(haystack: str, needle: str) -> int:
    lps = [0] * len(needle)
    matched = 0
    for i in range(1, len(needle)):
        while matched > 0 and needle[i] != needle[matched]:
            matched = lps[matched - 1]
        if needle[i] == needle[matched]:
            matched += 1
        lps[i] = matched

    matched = 0
    for i, ch in enumerate(haystack):
        while matched > 0 and ch != needle[matched]:
            matched = lps[matched - 1]
        if ch == needle[matched]:
            matched += 1
            if matched == len(needle):
                return i - matched + 1
    return -1


def main() -> None:
    s = sys.stdin.readline().rstrip("\n")
    t = sys.stdin.readline().rstrip("\n")
    print(solution(s, t))


if __name__ == "__main__":
    main()


# Input:
# aaaaab
# aaab
# Output:
# 2
#
# Input:
# banana
# ana
# Output:
# 1
#
# Input:
# abc
# abcd
# Output:
# -1
