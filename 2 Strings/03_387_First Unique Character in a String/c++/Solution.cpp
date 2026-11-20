#include <iostream>
#include <string>

int solution(const std::string& s) {
    int counts[26] = {};
    for (char ch : s) {
        ++counts[ch - 'a'];
    }
    for (int i = 0; i < static_cast<int>(s.size()); ++i) {
        if (counts[s[i] - 'a'] == 1) {
            return i;
        }
    }
    return -1;
}

int main() {
    std::string s;
    std::getline(std::cin, s);
    std::cout << solution(s) << '\n';
}

/*
Input:
swiss
Output:
1

Input:
zz
Output:
-1

Input:
q
Output:
0
*/
