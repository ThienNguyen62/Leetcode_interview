#include <algorithm>
#include <iostream>
#include <vector>

int solution(const std::vector<int>& nums) {
    int ending = nums[0];
    int best = ending;
    for (int i = 1; i < static_cast<int>(nums.size()); ++i) {
        ending = std::max(nums[i], ending + nums[i]);
        best = std::max(best, ending);
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
-4 2 -1 3 -7
Output:
4

Input:
4
-8 -3 -6 -2
Output:
-2

Input:
1
0
Output:
0
*/
