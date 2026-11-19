#include <iostream>
#include <vector>

int solution(const std::vector<int>& prices) {
    int profit = 0;
    for (std::size_t day = 1; day < prices.size(); ++day) {
        int increase = prices[day] - prices[day - 1];
        if (increase > 0) {
            profit += increase;
        }
    }
    return profit;
}

int main() {
    int days;
    if (!(std::cin >> days)) {
        return 0;
    }
    std::vector<int> prices(days);
    for (int& price : prices) {
        std::cin >> price;
    }
    std::cout << solution(prices) << '\n';
}

/*
Input:
5
2 5 1 4 4
Output:
6

Input:
1
8
Output:
0

Input:
5
9 7 7 3 0
Output:
0
*/
