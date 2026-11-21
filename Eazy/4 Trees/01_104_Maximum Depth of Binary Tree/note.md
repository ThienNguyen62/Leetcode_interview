# Bài 104 · Maximum Depth of Binary Tree

Dùng hàng đợi BFS. Trước mỗi vòng, hàng đợi chứa các nút của đúng một tầng. Lưu kích thước hàng đợi, lấy đúng số nút đó ra và thêm các con vào cuối. Khi xử lý xong, tăng độ sâu lên 1. Khi hết hàng đợi, số tầng đã đếm là độ sâu lớn nhất.

Ví dụ `8 4 9 null 6 null null 5` cho các tầng `[8]`, `[4, 9]`, `[6]`, `[5]`, nên đáp án là 4. Cây rỗng có độ sâu 0.

BFS dùng O(n) thời gian và O(w) bộ nhớ phụ, với n là số nút và w là số nút lớn nhất trên một tầng. DFS đệ quy dùng công thức `1 + max(depth(left), depth(right))`, cùng O(n) thời gian và O(h) ngăn xếp với h là chiều cao. Chọn BFS để tránh giới hạn đệ quy trên cây lệch tới 10^4 nút.

## Chạy thử

Nhập các giá trị theo thứ tự từng tầng, cách nhau bằng khoảng trắng. Dùng `null` cho con không tồn tại, chỉ liệt kê con của nút có thật và có thể bỏ các `null` ở cuối. Kết thúc dữ liệu để chương trình biết đã đọc xong.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Thứ hạng bình chọn trên LeetCode chưa được xác minh. [NeetCode](https://neetcode.io/solutions/maximum-depth-of-binary-tree)
