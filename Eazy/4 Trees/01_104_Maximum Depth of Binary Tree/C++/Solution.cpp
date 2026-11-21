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

int solution(const TreeNode* root) {
    if (!root) {
        return 0;
    }
    std::queue<const TreeNode*> pending;
    pending.push(root);
    int depth = 0;
    while (!pending.empty()) {
        for (auto remaining = pending.size(); remaining > 0; --remaining) {
            const auto* node = pending.front();
            pending.pop();
            if (node->left) {
                pending.push(node->left);
            }
            if (node->right) {
                pending.push(node->right);
            }
        }
        ++depth;
    }
    return depth;
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
    std::cout << solution(root) << '\n';
}

/*
Input:
8 4 9 null 6 null null 5
Output:
4

Input:
null
Output:
0

Input:
-2 -3 0
Output:
2
*/
