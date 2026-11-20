#include <iostream>
#include <string>
#include <utility>

void solution(std::string& s) {
    for (std::size_t left = 0; left < s.size() / 2; ++left) {
        std::swap(s[left], s[s.size() - 1 - left]);
    }
}

int main() {
    std::string s;
    std::getline(std::cin, s);
    solution(s);
    std::cout << s << '\n';
}

/*
Input:
Ab!?
Output:
?!bA

Input:
x
Output:
x

Input:
a b
Output:
b a
*/
