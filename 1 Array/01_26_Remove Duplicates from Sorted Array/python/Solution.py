import sys

# xử lí thuật toán
def solution(nums: list[int]) -> int:
    write = 1
    for read in range(1, len(nums)):
        if nums[read] != nums[write - 1]:
            nums[write] = nums[read]
            write += 1
    return write

#main
def main() -> None:
    tokens = (int(token) for line in sys.stdin for token in line.split())
    n = next(tokens)
    nums = [next(tokens) for _ in range(n)]

    k = solution(nums)
    print(k)
    print(" ".join(str(nums[i]) for i in range(k)))


if __name__ == "__main__":
    main()


# Input:
# 6
# -3 -3 -1 0 0 4
# Output:
# 4
# -3 -1 0 4
#
# Input:
# 1
# 7
# Output:
# 1
# 7
#
# Input:
# 4
# -2 -2 -2 -2
# Output:
# 1
# -2
