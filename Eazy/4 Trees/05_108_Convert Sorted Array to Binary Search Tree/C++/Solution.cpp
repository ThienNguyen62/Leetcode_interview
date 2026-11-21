#include <iostream>
#include <memory>
#include <queue>
#include <string>
#include <vector>

struct TreeNode {
    int value = 0;
    std::unique_ptr<TreeNode> left;
    std::unique_ptr<TreeNode> right;
};

std::unique_ptr<TreeNode> build(const std::vector<int>& nums, int left, int right) {
    if (left == right) {
        return nullptr;
    }
    int mid = left + (right - left) / 2;
    auto node = std::make_unique<TreeNode>();
    node->value = nums[mid];
    node->left = build(nums, left, mid);
    node->right = build(nums, mid + 1, right);
    return node;
}

std::unique_ptr<TreeNode> solution(const std::vector<int>& nums) {
    return build(nums, 0, static_cast<int>(nums.size()));
}

void printTree(const TreeNode* root) {
    std::vector<std::string> values;
    std::queue<const TreeNode*> pending;
    pending.push(root);
    while (!pending.empty()) {
        const auto* node = pending.front();
        pending.pop();
        if (!node) {
            values.push_back("null");
            continue;
        }
        values.push_back(std::to_string(node->value));
        pending.push(node->left.get());
        pending.push(node->right.get());
    }
    while (!values.empty() && values.back() == "null") {
        values.pop_back();
    }
    std::cout << '[';
    for (std::size_t i = 0; i < values.size(); ++i) {
        if (i > 0) {
            std::cout << ", ";
        }
        std::cout << values[i];
    }
    std::cout << "]\n";
}

int main() {
    int n;
    if (!(std::cin >> n)) {
        return 0;
    }
    std::vector<int> nums(n);
    for (int& value : nums) {
        std::cin >> value;
    }
    const auto root = solution(nums);
    printTree(root.get());
}

/*
Input:
4
-6 -2 1 7
Output:
[1, -2, 7, -6]

Input:
1
-11
Output:
[-11]

Input:
2
-3 5
Output:
[5, -3]
*/
