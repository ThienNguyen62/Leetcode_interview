#include <iostream>
#include <string>
#include <vector>

int solution(const std::string& haystack, const std::string& needle) {
    int m = static_cast<int>(needle.size());
    std::vector<int> lps(m);
    for (int i = 1, matched = 0; i < m; ++i) {
        while (matched > 0 && needle[i] != needle[matched]) {
            matched = lps[matched - 1];
        }
        if (needle[i] == needle[matched]) {
            ++matched;
        }
        lps[i] = matched;
    }

    for (int i = 0, matched = 0; i < static_cast<int>(haystack.size()); ++i) {
        while (matched > 0 && haystack[i] != needle[matched]) {
            matched = lps[matched - 1];
        }
        if (haystack[i] == needle[matched]) {
            ++matched;
            if (matched == m) {
                return i - m + 1;
            }
        }
    }
    return -1;
}

int main() {
    std::string s, t;
    std::getline(std::cin, s);
    std::getline(std::cin, t);
    std::cout << solution(s, t) << '\n';
}

/*
Input:
aaaaab
aaab
Output:
2

Input:
banana
ana
Output:
1

Input:
abc
abcd
Output:
-1
*/
