#include <iostream>
#include <utility>
#include <vector>

std::vector<int> solution(std::vector<int> nums) {
    for (auto it = nums.rbegin(); it != nums.rend(); ++it) {
        if (*it < 9) {
            ++*it;
            return nums;
        }
        *it = 0;
    }
    std::vector<int> result(nums.size() + 1, 0);
    result[0] = 1;
    return result;
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

    const auto result = solution(std::move(nums));
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
3
2 9 9
Output:
3 0 0

Input:
2
9 9
Output:
1 0 0

Input:
1
0
Output:
1
*/
