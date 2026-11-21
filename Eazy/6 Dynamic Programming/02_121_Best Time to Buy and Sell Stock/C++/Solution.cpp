#include <algorithm>
#include <iostream>
#include <vector>

int solution(const std::vector<int>& nums) {
    int lowest = nums[0];
    int best = 0;
    for (int i = 1; i < static_cast<int>(nums.size()); ++i) {
        best = std::max(best, nums[i] - lowest);
        lowest = std::min(lowest, nums[i]);
    }
    return best;
}

int main() {
    int n;
    if (!(std::cin >> n)) {
        return 0;
    }

    std::vector<int> nums(n);
    for (int& value : nums) {
        std::cin >> value;
    }
    std::cout << solution(nums) << '\n';
}

/*
Input:
5
8 3 6 2 7
Output:
5

Input:
4
9 7 7 3
Output:
0

Input:
1
0
Output:
0
*/
