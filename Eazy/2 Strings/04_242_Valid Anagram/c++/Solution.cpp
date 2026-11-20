#include <iostream>
#include <string>

bool solution(const std::string& s, const std::string& t) {
    if (s.size() != t.size()) {
        return false;
    }
    int counts[26] = {};
    for (char ch : s) {
        ++counts[ch - 'a'];
    }
    for (char ch : t) {
        if (--counts[ch - 'a'] < 0) {
            return false;
        }
    }
    return true;
}

int main() {
    std::string s, t;
    std::getline(std::cin, s);
    std::getline(std::cin, t);
    std::cout << std::boolalpha << solution(s, t) << '\n';
}

/*
Input:
aabc
baca
Output:
true

Input:
aabc
abcc
Output:
false

Input:
z
zz
Output:
false
*/
