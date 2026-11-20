#include <iostream>
#include <unordered_map>
#include <vector>

std::vector<int> solution(const std::vector<int>& nums1, const std::vector<int>& nums2) {
    const auto& smaller = nums1.size() <= nums2.size() ? nums1 : nums2;
    const auto& larger = nums1.size() <= nums2.size() ? nums2 : nums1;

    std::unordered_map<int, int> counts;
    for (int value : smaller) {
        ++counts[value];
    }

    std::vector<int> result;
    for (int value : larger) {
        auto count = counts.find(value);
        if (count != counts.end() && count->second > 0) {
            result.push_back(value);
            --count->second;
        }
    }
    return result;
}

int main() {
    int m, n;
    if (!(std::cin >> m >> n)) {
        return 0;
    }

    std::vector<int> nums1(m), nums2(n);
    for (int& value : nums1) {
        std::cin >> value;
    }
    for (int& value : nums2) {
        std::cin >> value;
    }

    const auto result = solution(nums1, nums2);
    std::cout << '[';
    for (std::size_t i = 0; i < result.size(); ++i) {
        if (i > 0) {
            std::cout << ", ";
        }
        std::cout << result[i];
    }
    std::cout << "]\n";
}

/*
Input:
3 6
5 2 5
2 5 8 5 5 2
Output:
[2, 5, 5]

Input:
2 3
0 1000
3 4 5
Output:
[]

Input:
5 2
7 1 7 3 7
7 7
Output:
[7, 7]
*/
