#include <iostream>
#include <limits>
#include <string>
#include <vector>

std::string solution(const std::vector<std::string>& strs) {
    const auto& first = strs.front();
    for (std::size_t col = 0; col < first.size(); ++col) {
        for (std::size_t row = 1; row < strs.size(); ++row) {
            if (col == strs[row].size() || strs[row][col] != first[col]) {
                return first.substr(0, col);
            }
        }
    }
    return first;
}

int main() {
    int n;
    if (!(std::cin >> n)) {
        return 0;
    }
    std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
    std::vector<std::string> strs(n);
    for (auto& s : strs) {
        std::getline(std::cin, s);
    }
    std::cout << solution(strs) << '\n';
}

/*
Input:
3
station
stay
stack
Output:
sta

Input:
3
ab

abc
Output:


Input:
1
alone
Output:
alone
*/
