#include <iostream>
#include <vector>

struct ListNode {
    int value = 0;
    ListNode* next = nullptr;
};

ListNode* reverse(ListNode* head) {
    ListNode* prev = nullptr;
    while (head != nullptr) {
        ListNode* next = head->next;
        head->next = prev;
        prev = head;
        head = next;
    }
    return prev;
}

bool solution(ListNode* head) {
    if (head == nullptr) {
        return true;
    }
    ListNode* slow = head;
    ListNode* fast = head;
    while (fast->next != nullptr && fast->next->next != nullptr) {
        slow = slow->next;
        fast = fast->next->next;
    }
    ListNode* second = reverse(slow->next);
    bool matches = true;
    for (ListNode* left = head, *right = second; right != nullptr; right = right->next) {
        if (left->value != right->value) {
            matches = false;
            break;
        }
        left = left->next;
    }
    slow->next = reverse(second);
    return matches;
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
    int n;
    if (!(std::cin >> n)) {
        return 0;
    }
    std::vector<ListNode> nodes(n);
    readList(nodes);
    ListNode* head = nodes.empty() ? nullptr : &nodes.front();

    std::cout << std::boolalpha << solution(head) << '\n';
}

/*
Input:
5
3 7 0 7 3
Output:
true

Input:
4
4 5 5 6
Output:
false

Input:
1
8
Output:
true
*/
