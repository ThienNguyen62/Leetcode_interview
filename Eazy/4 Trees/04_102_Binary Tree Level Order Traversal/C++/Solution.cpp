#include <iostream>
#include <memory>
#include <queue>
#include <string>
#include <utility>
#include <vector>

struct TreeNode {
    int value = 0;
    TreeNode* left = nullptr;
    TreeNode* right = nullptr;
};

std::vector<std::vector<int>> solution(const TreeNode* root) {
    std::vector<std::vector<int>> levels;
    if (!root) {
        return levels;
    }
    std::queue<const TreeNode*> pending;
    pending.push(root);
    while (!pending.empty()) {
        auto& level = levels.emplace_back();
        for (auto remaining = pending.size(); remaining > 0; --remaining) {
            const auto* node = pending.front();
            pending.pop();
            level.push_back(node->value);
            if (node->left) {
                pending.push(node->left);
            }
            if (node->right) {
                pending.push(node->right);
            }
        }
    }
    return levels;
}

TreeNode* readTree(std::vector<std::unique_ptr<TreeNode>>& nodes) {
    auto readNode = [&]() -> TreeNode* {
        std::string token;
        if (!(std::cin >> token) || token == "null") {
            return nullptr;
        }
        auto node = std::make_unique<TreeNode>();
        node->value = std::stoi(token);
        nodes.push_back(std::move(node));
        return nodes.back().get();
    };

    TreeNode* root = readNode();
    if (!root) {
        return nullptr;
    }
    std::queue<TreeNode*> pending;
    pending.push(root);
    while (!pending.empty() && std::cin) {
        auto* node = pending.front();
        pending.pop();
        node->left = readNode();
        node->right = readNode();
        if (node->left) {
            pending.push(node->left);
        }
        if (node->right) {
            pending.push(node->right);
        }
    }
    return root;
}

void printLevels(const std::vector<std::vector<int>>& levels) {
    std::cout << '[';
    for (std::size_t i = 0; i < levels.size(); ++i) {
        if (i > 0) {
            std::cout << ", ";
        }
        std::cout << '[';
        for (std::size_t j = 0; j < levels[i].size(); ++j) {
            if (j > 0) {
                std::cout << ", ";
            }
            std::cout << levels[i][j];
        }
        std::cout << ']';
    }
    std::cout << "]\n";
}

int main() {
    std::vector<std::unique_ptr<TreeNode>> nodes;
    const auto* root = readTree(nodes);
    printLevels(solution(root));
}

/*
Input:
8 2 9 null 5 6
Output:
[[8], [2, 9], [5, 6]]

Input:
-7
Output:
[[-7]]

Input:
4 null 9 null 12
Output:
[[4], [9], [12]]
*/
