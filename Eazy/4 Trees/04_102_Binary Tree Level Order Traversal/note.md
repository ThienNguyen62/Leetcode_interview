# Bài 102 · Binary Tree Level Order Traversal

Dùng hàng đợi chứa các nút cần xét. Ở đầu mỗi lượt, chụp kích thước hàng đợi để biết có bao nhiêu nút thuộc tầng hiện tại. Lấy đúng số nút đó ra và luôn thêm con trái trước con phải. Nút mới thêm thuộc tầng sau, nên không được lấy ngay trong lượt này.

Ví dụ `8 2 9 null 5 6` cho `[[8], [2, 9], [5, 6]]`. Các nút rỗng chỉ giúp mã hóa cấu trúc đầu vào. Kết quả chỉ chứa giá trị của các nút có thật.

BFS dùng O(n) thời gian và O(w) bộ nhớ phụ ngoài kết quả, với n là số nút và w là độ rộng lớn nhất. DFS cũng có thể dùng chỉ số độ sâu để thêm vào nhóm phù hợp, dùng O(n) thời gian và O(h) ngăn xếp với h là chiều cao.

## Chạy thử

Nhập các giá trị theo thứ tự từng tầng, cách nhau bằng khoảng trắng. Dùng `null` cho con không tồn tại, chỉ liệt kê con của nút có thật và có thể bỏ các `null` ở cuối. Kết thúc dữ liệu để chương trình biết đã đọc xong.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Thứ hạng bình chọn trên LeetCode chưa được xác minh. [NeetCode](https://neetcode.io/solutions/binary-tree-level-order-traversal)
