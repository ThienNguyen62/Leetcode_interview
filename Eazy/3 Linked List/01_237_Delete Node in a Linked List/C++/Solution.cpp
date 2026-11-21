#include <iostream>
#include <vector>

struct ListNode {
    int value = 0;
    ListNode* next = nullptr;
};

void solution(ListNode* node) {
    ListNode* successor = node->next;
    node->value = successor->value;
    node->next = successor->next;
}

void readList(std::vector<ListNode>& nodes) {
    for (std::size_t i = 0; i < nodes.size(); ++i) {
        std::cin >> nodes[i].value;
        if (i > 0) {
            nodes[i - 1].next = &nodes[i];
        }
    }
}

void printList(const ListNode* head) {
    for (const ListNode* node = head; node != nullptr; node = node->next) {
        if (node != head) {
            std::cout << ' ';
        }
        std::cout << node->value;
    }
    std::cout << '\n';
}

int main() {
    int n, target;
    if (!(std::cin >> n >> target)) {
        return 0;
    }
    std::vector<ListNode> nodes(n);
    readList(nodes);
    ListNode* head = nodes.empty() ? nullptr : &nodes.front();

    ListNode* targetNode = head;
    while (targetNode->value != target) {
        targetNode = targetNode->next;
    }
    solution(targetNode);
    printList(head);
}

/*
Input:
4 3
8 3 6 2
Output:
8 6 2

Input:
2 -4
-4 9
Output:
9

Input:
4 10
1 5 10 0
Output:
1 5 0
*/
