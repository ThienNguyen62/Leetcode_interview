#include <iostream>
#include <vector>

int solution(std::vector<int>& nums) {
    int write = 1;
    for (int read = 1; read < static_cast<int>(nums.size()); ++read) {
        if (nums[read] != nums[write - 1]) {
            nums[write] = nums[read];
            ++write;
        }
    }
    return write;
}

int main() {
    int n;
    if (!(std::cin >> n)) {
        return 0;
    }
    std::vector<int> nums(n);
    for (int& num : nums) {
        std::cin >> num;
    }

    int k = solution(nums);
    std::cout << k << '\n';
    for (int i = 0; i < k; ++i) {
        if (i > 0) {
            std::cout << ' ';
        }
        std::cout << nums[i];
    }
    std::cout << '\n';
}

/*
Input:
6
-3 -3 -1 0 0 4
Output:
4
-3 -1 0 4

Input:
1
7
Output:
1
7

Input:
4
-2 -2 -2 -2
Output:
1
-2
*/
