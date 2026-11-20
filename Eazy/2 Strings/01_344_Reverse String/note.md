# Bài 344 · Reverse String

Đặt hai con trỏ ở đầu và cuối. Ô vị trí i phải đổi với ô n - 1 - i. Đổi cặp ngoài cùng rồi tiến cả hai con trỏ vào giữa. Các ô nằm ngoài hai con trỏ đã ở đúng vị trí, nên dừng khi chúng gặp hoặc vượt nhau.

Ví dụ `Ab!?` → `?b!A` → `?!bA`. Ký tự ở giữa chuỗi lẻ giữ nguyên. Với n ký tự, đổi chỗ mất O(n) thời gian và O(1) bộ nhớ phụ. Tạo bản đảo trong mảng mới cũng mất O(n) thời gian nhưng cần O(n) bộ nhớ; dùng đệ quy đổi cặp cũng cần O(n) ngăn xếp.

Nhập một dòng nguyên văn. Chương trình in chuỗi đã đảo.

Lời giải chính có trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [NeetCode](https://neetcode.io/solutions/reverse-string)
