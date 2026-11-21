#include <algorithm>
#include <iostream>
#include <vector>

int solution(const std::vector<int>& nums) {
    int twoBack = 0;
    int oneBack = 0;
    for (int money : nums) {
        int current = std::max(oneBack, twoBack + money);
        twoBack = oneBack;
        oneBack = current;
    }
    return oneBack;
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
4
4 1 1 9
Output:
13

Input:
1
0
Output:
0

Input:
3
8 10 8
Output:
16
*/
