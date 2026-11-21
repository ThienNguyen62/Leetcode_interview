#include <iostream>
#include <vector>

struct ListNode {
    int value = 0;
    ListNode* next = nullptr;
};

ListNode* solution(ListNode* head) {
    ListNode* prev = nullptr;
    while (head != nullptr) {
        ListNode* next = head->next;
        head->next = prev;
        prev = head;
        head = next;
    }
    return prev;
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
    int n;
    if (!(std::cin >> n)) {
        return 0;
    }
    std::vector<ListNode> nodes(n);
    readList(nodes);
    ListNode* head = nodes.empty() ? nullptr : &nodes.front();

    printList(solution(head));
}

/*
Input:
3
4 7 2
Output:
2 7 4

Input:
1
-6
Output:
-6

Input:
4
8 0 8 -3
Output:
-3 8 0 8
*/
