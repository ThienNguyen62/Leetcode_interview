# Bài 98 · Validate Binary Search Tree

BST hợp lệ có dãy duyệt inorder (trái, nút, phải) tăng nghiêm ngặt. Ngược lại, nếu toàn dãy tăng nghiêm ngặt, mọi giá trị trong cây con trái đứng trước và nhỏ hơn nút, còn mọi giá trị ở cây con phải đứng sau và lớn hơn nút. Dùng ngăn xếp để duyệt inorder và giữ giá trị vừa đọc. Nếu giá trị mới nhỏ hơn hoặc bằng giá trị trước, trả false.

Ví dụ `8 3 10 null null 6 12` cho dãy `3, 8, 6, 10, 12`. Số 6 nhỏ hơn 8 dù chính nó là con trái hợp lệ của 10. So trực tiếp với con không phát hiện được lỗi xuyên nhiều tầng. Dùng trạng thái chưa có giá trị trước để xử lý cả giá trị nhỏ nhất 32 bit.

Với n nút và chiều cao h, inorder dùng O(n) thời gian và O(h) bộ nhớ phụ. DFS truyền khoảng mở của tổ tiên cũng có cùng cận nhưng nếu dùng đệ quy, cây lệch có thể vượt giới hạn ngăn xếp của ngôn ngữ.

## Chạy thử

Nhập các giá trị theo thứ tự từng tầng, cách nhau bằng khoảng trắng. Dùng `null` cho con không tồn tại, chỉ liệt kê con của nút có thật và có thể bỏ các `null` ở cuối. Kết thúc dữ liệu để chương trình biết đã đọc xong.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Thứ hạng bình chọn trên LeetCode chưa được xác minh. [NeetCode](https://neetcode.io/solutions/validate-binary-search-tree)
