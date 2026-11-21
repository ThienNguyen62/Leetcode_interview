#include <iostream>
#include <vector>

struct ListNode {
    int value = 0;
    ListNode* next = nullptr;
};

ListNode* solution(ListNode* head, int k) {
    ListNode dummy{0, head};
    ListNode* fast = &dummy;
    ListNode* slow = &dummy;
    for (int i = 0; i < k; ++i) {
        fast = fast->next;
    }
    while (fast->next != nullptr) {
        fast = fast->next;
        slow = slow->next;
    }
    slow->next = slow->next->next;
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
    int n, k;
    if (!(std::cin >> n >> k)) {
        return 0;
    }
    std::vector<ListNode> nodes(n);
    readList(nodes);
    ListNode* head = nodes.empty() ? nullptr : &nodes.front();

    printList(solution(head, k));
}

/*
Input:
4 2
8 4 6 2
Output:
8 4 2

Input:
3 3
0 9 4
Output:
9 4

Input:
3 1
7 7 5
Output:
7 7
*/
