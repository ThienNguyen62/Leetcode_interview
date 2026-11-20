#include <iostream>
#include <unordered_map>
#include <vector>

std::vector<int> solution(const std::vector<int>& nums, int target) {
    std::unordered_map<int, int> seen;
    for (int i = 0; i < static_cast<int>(nums.size()); ++i) {
        const auto match = seen.find(target - nums[i]);
        if (match != seen.end()) {
            return {match->second, i};
        }
        seen[nums[i]] = i;
    }
    return {};
}

int main() {
    int n, target;
    if (!(std::cin >> n >> target)) {
        return 0;
    }
    std::vector<int> nums(n);
    for (int& value : nums) {
        std::cin >> value;
    }

    const auto result = solution(nums, target);
    for (std::size_t i = 0; i < result.size(); ++i) {
        if (i > 0) {
            std::cout << ' ';
        }
        std::cout << result[i];
    }
    std::cout << '\n';
}

/*
Input:
4 5
4 -2 7 1
Output:
1 2

Input:
2 10
5 5
Output:
0 1

Input:
3 -8
0 -3 -5
Output:
1 2
*/
