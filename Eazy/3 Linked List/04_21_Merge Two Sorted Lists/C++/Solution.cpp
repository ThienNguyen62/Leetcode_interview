#include <iostream>
#include <vector>

struct ListNode {
    int value = 0;
    ListNode* next = nullptr;
};

ListNode* solution(ListNode* first, ListNode* second) {
    ListNode dummy;
    ListNode* tail = &dummy;
    while (first != nullptr && second != nullptr) {
        if (first->value <= second->value) {
            tail->next = first;
            first = first->next;
        } else {
            tail->next = second;
            second = second->next;
        }
        tail = tail->next;
    }
    tail->next = first != nullptr ? first : second;
    return dummy.next;
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
    int n, m;
    if (!(std::cin >> n >> m)) {
        return 0;
    }
    std::vector<ListNode> nodes(n);
    readList(nodes);
    ListNode* head = nodes.empty() ? nullptr : &nodes.front();

    std::vector<ListNode> other(m);
    readList(other);
    ListNode* second = other.empty() ? nullptr : &other.front();
    printList(solution(head, second));
}

/*
Input:
3 3
-5 2 2
-3 2 7
Output:
-5 -3 2 2 2 7

Input:
0 2
-8 4
Output:
-8 4

Input:
2 0
1 5
Output:
1 5
*/
