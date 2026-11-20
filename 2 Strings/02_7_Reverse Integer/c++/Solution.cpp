#include <iostream>
#include <climits>

int solution(int x) {
    int result = 0;
    while (x != 0) {
        int digit = x % 10;
        x /= 10;
        if (result > INT_MAX / 10 || (result == INT_MAX / 10 && digit > 7) ||
            result < INT_MIN / 10 || (result == INT_MIN / 10 && digit < -8)) {
            return 0;
        }
        result = result * 10 + digit;
    }
    return result;
}

int main() {
    int x;
    if (std::cin >> x) {
        std::cout << solution(x) << '\n';
    }
}

/*
Input:
-1204
Output:
-4021

Input:
1534236469
Output:
0

Input:
-2147483412
Output:
-2143847412
*/
