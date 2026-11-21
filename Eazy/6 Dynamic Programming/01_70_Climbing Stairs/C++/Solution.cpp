#include <iostream>

int solution(int n) {
    int previous = 1;
    int current = 1;
    for (int step = 2; step <= n; ++step) {
        int next = previous + current;
        previous = current;
        current = next;
    }
    return current;
}

int main() {
    int n;
    if (!(std::cin >> n)) {
        return 0;
    }
    std::cout << solution(n) << '\n';
}

/*
Input:
4
Output:
5

Input:
1
Output:
1

Input:
45
Output:
1836311903
*/
