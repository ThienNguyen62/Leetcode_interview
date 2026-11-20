#include <iostream>
#include <algorithm>
#include <vector>

void solution(std::vector<std::vector<int>>& matrix) {
    int n = static_cast<int>(matrix.size());
    for (int row = 0; row < n; ++row) {
        for (int col = row + 1; col < n; ++col) {
            std::swap(matrix[row][col], matrix[col][row]);
        }
    }
    for (auto& row : matrix) {
        std::reverse(row.begin(), row.end());
    }
}

int main() {
    int n;
    if (!(std::cin >> n)) {
        return 0;
    }
    std::vector<std::vector<int>> matrix(n, std::vector<int>(n));
    for (auto& row : matrix) {
        for (int& value : row) {
            std::cin >> value;
        }
    }

    solution(matrix);
    for (const auto& row : matrix) {
        for (std::size_t i = 0; i < row.size(); ++i) {
            if (i > 0) {
                std::cout << ' ';
            }
            std::cout << row[i];
        }
        std::cout << '\n';
    }
}

/*
Input:
2
8 3
2 -1
Output:
2 8
-1 3

Input:
1
-7
Output:
-7

Input:
3
0 1 2
3 4 5
6 7 8
Output:
6 3 0
7 4 1
8 5 2
*/
