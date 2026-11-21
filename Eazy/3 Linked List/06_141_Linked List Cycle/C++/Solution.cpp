#include <iostream>
#include <vector>

struct ListNode {
    int value = 0;
    ListNode* next = nullptr;
};

bool solution(ListNode* head) {
    ListNode* slow = head;
    ListNode* fast = head;
    while (fast != nullptr && fast->next != nullptr) {
        slow = slow->next;
        fast = fast->next->next;
        if (slow == fast) {
            return true;
        }
    }
    return false;
}

void readList(std::vector<ListNode>& nodes) {
    for (std::size_t i = 0; i < nodes.size(); ++i) {
        std::cin >> nodes[i].value;
        if (i > 0) {
            nodes[i - 1].next = &nodes[i];
        }
    }
}

int main() {
    int n, pos;
    if (!(std::cin >> n >> pos)) {
        return 0;
    }
    std::vector<ListNode> nodes(n);
    readList(nodes);
    ListNode* head = nodes.empty() ? nullptr : &nodes.front();

    if (pos >= 0) {
        nodes.back().next = &nodes[pos];
    }
    std::cout << std::boolalpha << solution(head) << '\n';
}

/*
Input:
4 2
5 -1 8 2
Output:
true

Input:
3 -1
4 4 4
Output:
false

Input:
1 0
9
Output:
true
*/
