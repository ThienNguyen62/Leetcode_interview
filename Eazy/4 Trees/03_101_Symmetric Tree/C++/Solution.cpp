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

bool mirrors(const TreeNode* left, const TreeNode* right) {
    if (!left || !right) {
        return left == right;
    }
    return left->value == right->value &&
           mirrors(left->left, right->right) &&
           mirrors(left->right, right->left);
}

bool solution(const TreeNode* root) {
    return !root || mirrors(root->left, root->right);
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
7 4 4 null 9 9 null
Output:
true

Input:
7 4 4 null 9 null 9
Output:
false

Input:
-7
Output:
true
*/
