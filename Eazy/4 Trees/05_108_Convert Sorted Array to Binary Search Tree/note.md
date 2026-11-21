# Bài 108 · Convert Sorted Array to Binary Search Tree

Chọn phần tử giữa làm gốc. Vì mảng tăng nghiêm ngặt, mọi phần tử bên trái gốc nhỏ hơn nó và mọi phần tử bên phải lớn hơn nó. Áp dụng lại cho từng đoạn con. Chia tại giữa làm số phần tử của hai đoạn chênh tối đa 1. Với cùng quy tắc chọn giữa ở mọi tầng, chiều cao của đoạn có k phần tử là floor(log₂(k)) + 1 nếu k > 0, nên hai cây con chênh cao tối đa 1.

Ví dụ `[-6, -2, 1, 7]`: lấy giữa bên phải là 1, dựng cây trái từ `[-6, -2]` với gốc -2 và cây phải từ `[7]`. Chọn giữa bên trái cũng có thể cho cây hợp lệ. Code dùng đoạn nửa mở `[left, right)` và chọn giữa bên phải khi số phần tử chẵn.

Với n phần tử, chia để trị dùng O(n) thời gian và O(log n) ngăn xếp ngoài n nút trả về. Bản lặp có thể dùng ngăn xếp chứa đoạn chỉ số và vị trí gắn nút. Chèn lần lượt mảng đã sắp xếp vào BST thông thường sẽ tạo cây lệch và tốn O(n²) thời gian.

## Chạy thử

Nhập n rồi nhập n số tăng nghiêm ngặt. Kết quả là cây theo thứ tự từng tầng, với `null` cho vị trí thiếu con. Các `null` ở cuối được lược bỏ.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Thứ hạng bình chọn trên LeetCode chưa được xác minh. [NeetCode](https://neetcode.io/solutions/convert-sorted-array-to-binary-search-tree)
