#include <algorithm>
#include <iostream>
#include <vector>

void solution(std::vector<int>& nums, int k) {
    k %= static_cast<int>(nums.size());
    if (k == 0) {
        return;
    }

    std::reverse(nums.begin(), nums.end());
    std::reverse(nums.begin(), nums.begin() + k);
    std::reverse(nums.begin() + k, nums.end());
}

int main() {
    int n, k;
    if (!(std::cin >> n >> k)) {
        return 0;
    }

    std::vector<int> nums(n);
    for (int& num : nums) {
        std::cin >> num;
    }

    solution(nums, k);
    for (int i = 0; i < n; ++i) {
        if (i > 0) {
            std::cout << ' ';
        }
        std::cout << nums[i];
    }
    std::cout << '\n';
}

/*
Input:
5 2
8 2 6 1 3
Output:
1 3 8 2 6

Input:
4 6
-2 0 -2 9
Output:
-2 9 -2 0

Input:
3 0
4 4 -7
Output:
4 4 -7
*/
