#include <iostream>
#include <unordered_set>
#include <vector>

bool solution(const std::vector<int>& nums) {
    std::unordered_set<int> seen;
    for (int num : nums) {
        if (!seen.insert(num).second) {
            return true;
        }
    }
    return false;
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

    std::cout << std::boolalpha << solution(nums) << '\n';
}

/*
Input:
5
-4 6 0 9 -4
Output:
true

Input:
1
-1000000000
Output:
false

Input:
4
1000000000 0 -5 7
Output:
false
*/
