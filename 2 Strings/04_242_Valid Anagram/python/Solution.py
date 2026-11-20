import sys


def solution(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False
    counts = [0] * 26
    for ch in s:
        counts[ord(ch) - ord("a")] += 1
    for ch in t:
        index = ord(ch) - ord("a")
        counts[index] -= 1
        if counts[index] < 0:
            return False
    return True


def main() -> None:
    s = sys.stdin.readline().rstrip("\n")
    t = sys.stdin.readline().rstrip("\n")
    print(str(solution(s, t)).lower())


if __name__ == "__main__":
    main()


# Input:
# aabc
# baca
# Output:
# true
#
# Input:
# aabc
# abcc
# Output:
# false
#
# Input:
# z
# zz
# Output:
# false
