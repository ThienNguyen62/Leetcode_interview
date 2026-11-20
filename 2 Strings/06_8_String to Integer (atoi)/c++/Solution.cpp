#include <iostream>
#include <climits>
#include <string>

int solution(const std::string& s) {
    std::size_t i = 0;
    while (i < s.size() && s[i] == ' ') {
        ++i;
    }

    bool negative = false;
    if (i < s.size() && (s[i] == '+' || s[i] == '-')) {
        negative = s[i] == '-';
        ++i;
    }

    int value = 0;
    int lastDigit = negative ? 8 : 7;
    while (i < s.size() && s[i] >= '0' && s[i] <= '9') {
        int digit = s[i] - '0';
        if (value < INT_MIN / 10 || (value == INT_MIN / 10 && digit > lastDigit)) {
            return negative ? INT_MIN : INT_MAX;
        }
        value = value * 10 - digit;
        ++i;
    }
    return negative ? value : -value;
}

int main() {
    std::string s;
    std::getline(std::cin, s);
    std::cout << solution(s) << '\n';
}

/*
Input:
  -0012x3
Output:
-12

Input:
2147483648
Output:
2147483647

Input:
-2147483649
Output:
-2147483648
*/
