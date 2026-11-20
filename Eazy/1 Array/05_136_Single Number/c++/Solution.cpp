#include <iostream>
#include <vector>

int solution(const std::vector<int>& nums) {
    int result = 0;
    for (int num : nums) {
        result ^= num;
    }
    return result;
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
    std::cout << solution(nums) << '\n';
}

/*
Input:
5
8 -3 8 2 2
Output:
-3

Input:
1
30000
Output:
30000

Input:
5
-7 12 0 -7 12
Output:
0
*/
