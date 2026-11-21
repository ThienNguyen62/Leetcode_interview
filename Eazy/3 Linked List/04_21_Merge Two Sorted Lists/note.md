# Bài 21 · Merge Two Sorted Lists

## Tư duy giải bài

Dùng node giả làm điểm bắt đầu và tail là node cuối đã ghép. Vì mỗi danh sách đã sắp xếp, node nhỏ nhất còn lại luôn là một trong hai head hiện tại. Nối node nhỏ hơn vào tail rồi tiến danh sách vừa lấy. Khi một bên hết, nối ngay đoạn còn lại ở bên kia.

Ví dụ `[-5, 2, 2]` và `[-3, 2, 7]`. Lấy -5 rồi -3, nối đủ ba bản sao của 2 và cuối cùng nối 7. Nếu hai head bằng nhau, chọn bên nào trước cũng cho thứ tự không giảm.

Với m và n là độ dài hai danh sách, cách lặp dùng O(m + n) thời gian và O(1) bộ nhớ phụ vì tái sử dụng các node. Cách đệ quy chọn head nhỏ hơn rồi ghép phần còn lại, cũng dùng O(m + n) thời gian nhưng có thể cần O(m + n) ngăn xếp.

Nhập `m n`, rồi m giá trị của danh sách đầu và n giá trị của danh sách sau. In danh sách đã ghép, hoặc một dòng trống nếu cả hai rỗng.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [Doocs](https://leetcode.doocs.org/en/lc/21/)
