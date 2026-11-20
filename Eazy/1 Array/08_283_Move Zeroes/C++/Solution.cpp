#include <iostream>
#include <utility>
#include <vector>

void solution(std::vector<int>& nums) {
    std::size_t write = 0;
    for (std::size_t read = 0; read < nums.size(); ++read) {
        if (nums[read] != 0) {
            if (read != write) {
                std::swap(nums[read], nums[write]);
            }
            ++write;
        }
    }
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

    solution(nums);
    for (std::size_t i = 0; i < nums.size(); ++i) {
        if (i > 0) {
            std::cout << ' ';
        }
        std::cout << nums[i];
    }
    std::cout << '\n';
}

/*
Input:
4
0 -2 0 5
Output:
-2 5 0 0

Input:
3
0 0 0
Output:
0 0 0

Input:
3
4 2 -1
Output:
4 2 -1
*/
