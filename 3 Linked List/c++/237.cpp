/* 237 delete nODE IN LINKED LIST
There is a singly-linked list head and we want to delete a node node in it.

You are given the node to be deleted node. You will not be given access to the first node of head.

All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.

Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:

The value of the given node should not exist in the linked list.
The number of nodes in the linked list should decrease by one.
All the values before node should be in the same order.
All the values after node should be in the same order.
Custom testing:

For the input, you should provide the entire linked list head and the node to be given node. node should not be the last node of the list and should be an actual node in the list.
We will build the linked list and pass the node to your function.
The output will be the entire list after calling your function.
*/

/*
Có một danh sách liên kết đơn (singly linked list) tên là head, và chúng ta muốn xóa một node node trong danh sách đó.

Bạn sẽ được cung cấp chính node cần xóa (node), nhưng không được cung cấp node đầu tiên (head) của danh sách.

Các giá trị trong danh sách liên kết đều không trùng nhau, và đề bài đảm bảo rằng node được cho không phải là node cuối cùng.

Hãy xóa node đó.

⚠️ Lưu ý: "Xóa node" ở đây không có nghĩa là giải phóng vùng nhớ của node đó. Ý của đề là:

Giá trị của node cần xóa không còn xuất hiện trong danh sách.
Số lượng node trong danh sách giảm đi 1.
Thứ tự các node đứng trước node cần xóa phải được giữ nguyên.
Thứ tự các node đứng sau node cần xóa phải được giữ nguyên.


Bình thường cho head và node cần xóa, có thể duyệt từ đầu
bài này chỉ cho node cần xóa, không có head
*/


#include <bits/stdc++.h>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x)
    {
        val =x;
        next=NULL;
    }
};
// hàm letcode
class Solution {
    public:
    void deleteNode(ListNode* node)
    {
        node -> val = node -> next->val;
        ListNode *temp = node -> next;
        node -> next = node -> next-> next;
        delete temp;
    }
};
void printList (ListNode *head)
{
    while (head != NULL)
    {
    cout << head->val;
    if(head ->next!=NULL)
    {
        cout<<"->";

    }
    head = head ->next;
    }
    cout <<endl;
}
int main ()
{
    int n;
    cin>>n;
    int x;
    cin>>x;
    ListNode *head = new ListNode(x);
    ListNode *tail = head;

    for (int i =1 ; i<n;i++)
    {
        cin >> x;
        tail ->next = new ListNode (x);
        tail = tail ->next;
    }
    int target;
    cin >> target;
    ListNode *node = head;
    while (node != NULL && node->val != target) {
        node = node->next;
    }

    if (node == NULL) {
        cout << "Khong tim thay node";
        return 0;
    }

    if (node->next == NULL) {
        cout << "Khong the xoa node cuoi";
        return 0;
    }

    Solution s;
    s.deleteNode(node);

    printList(head);

    return 0;
}
