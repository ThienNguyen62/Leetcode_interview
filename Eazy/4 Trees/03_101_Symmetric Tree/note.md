# Bài 101 · Symmetric Tree

So sánh hai nút ở vị trí đối xứng. Nếu cả hai rỗng thì khớp. Nếu chỉ một nút rỗng hoặc giá trị khác nhau thì không khớp. Nếu cả hai tồn tại và có cùng giá trị, so con trái bên này với con phải bên kia, rồi so cặp còn lại.

Ví dụ `7 4 4 null 9 9 null` cho cặp 4 và 4, cặp ngoài đều rỗng và cặp trong đều là 9, nên đối xứng. Nếu chuyển 9 bên phải sang con phải của nó, giá trị vẫn giống nhưng vị trí không đối xứng.

Bản đệ quy dùng O(n) thời gian và O(h) ngăn xếp, với n là số nút và h là chiều cao. Bản lặp có thể đưa từng cặp đối xứng vào hàng đợi, dùng O(n) thời gian và O(w) bộ nhớ phụ, với w là độ rộng lớn nhất.

## Chạy thử

Nhập các giá trị theo thứ tự từng tầng, cách nhau bằng khoảng trắng. Dùng `null` cho con không tồn tại, chỉ liệt kê con của nút có thật và có thể bỏ các `null` ở cuối. Kết thúc dữ liệu để chương trình biết đã đọc xong.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Thứ hạng bình chọn trên LeetCode chưa được xác minh. [NeetCode](https://neetcode.io/solutions/symmetric-tree)
