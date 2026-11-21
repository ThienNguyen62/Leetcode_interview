# Bài 206 · Reverse Linked List

## Tư duy giải bài

Duy trì `prev` là đầu đoạn đã đảo và `current` là đầu đoạn chưa xử lý. Cất `current.next` trước khi đổi hướng liên kết, rồi đưa current vào đầu đoạn đã đảo. Sau mỗi lượt, prev trỏ tới toàn bộ phần đã xử lý theo thứ tự ngược. Khi current rỗng, prev là head mới.

Ví dụ `4 → 7 → 2`: các đoạn đã đảo lần lượt là `4`, `7 → 4`, rồi `2 → 7 → 4`. Với n node, bản lặp dùng O(n) thời gian và O(1) bộ nhớ phụ.

Bản đệ quy đảo phần sau trước. Khi quay lui, nối node kế tiếp về node hiện tại bằng `head.next.next = head`, rồi đặt `head.next = null` để tránh vòng. Node cuối ban đầu là head mới. Cách này cũng tốn O(n) thời gian nhưng cần O(n) ngăn xếp.

Nhập n rồi nhập n giá trị. Một danh sách rỗng cho ra dòng trống.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [Doocs](https://leetcode.doocs.org/en/lc/206/)
