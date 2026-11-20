#include <iostream>
#include <cctype>
#include <string>

bool solution(const std::string& s) {
    int left = 0, right = static_cast<int>(s.size()) - 1;
    while (left < right) {
        if (!std::isalnum(static_cast<unsigned char>(s[left]))) {
            ++left;
        } else if (!std::isalnum(static_cast<unsigned char>(s[right]))) {
            --right;
        } else {
            if (std::tolower(static_cast<unsigned char>(s[left])) !=
                std::tolower(static_cast<unsigned char>(s[right]))) {
                return false;
            }
            ++left;
            --right;
        }
    }
    return true;
}

int main() {
    std::string s;
    std::getline(std::cin, s);
    std::cout << std::boolalpha << solution(s) << '\n';
}

/*
Input:
Z!2-z
Output:
true

Input:
0P
Output:
false

Input:
...?
Output:
true
*/
