#include <iostream>
#include <memory>
#include <queue>
#include <stack>
#include <string>
#include <utility>
#include <vector>

struct TreeNode {
    int value = 0;
    TreeNode* left = nullptr;
    TreeNode* right = nullptr;
};

bool solution(const TreeNode* root) {
    std::stack<const TreeNode*> pending;
    const TreeNode* current = root;
    const TreeNode* previous = nullptr;
    while (current || !pending.empty()) {
        while (current) {
            pending.push(current);
            current = current->left;
        }
        current = pending.top();
        pending.pop();
        if (previous && current->value <= previous->value) {
            return false;
        }
        previous = current;
        current = current->right;
    }
    return true;
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

int main() {
    std::vector<std::unique_ptr<TreeNode>> nodes;
    const auto* root = readTree(nodes);
    std::cout << std::boolalpha << solution(root) << '\n';
}

/*
Input:
8 3 10 null null 6 12
Output:
false

Input:
0 -2147483648 2147483647
Output:
true

Input:
6 6 8
Output:
false
*/
