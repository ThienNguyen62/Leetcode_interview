# Bài 242 · Valid Anagram

Nếu độ dài khác nhau thì trả false ngay. Đếm số lần xuất hiện trong s, rồi trừ từng ký tự của t. Một ô âm nghĩa là t đã dùng nhiều hơn số bản sao s có. Nếu duyệt hết mà không gặp ô âm thì các tần suất bằng nhau, vì tổng hai số lượng bằng nhau.

Với `aabc` và `abcc`, bảng ban đầu có a:2, b:1, c:1. Chữ c thứ hai làm ô c thành -1, nên kết quả là false. Nếu dùng `baca` làm chuỗi thứ hai, mọi ô về 0.

Với hai chuỗi cùng độ dài n, cách đếm mất O(n) thời gian và O(1) bộ nhớ phụ cho 26 chữ cái. Sắp xếp rồi so sánh mất O(n log n) thời gian và cần O(n) bộ nhớ nếu tạo bản sao chuỗi. Với Unicode có thể dùng bảng băm theo code point, dùng O(k) bộ nhớ cho k ký tự phân biệt. Chuẩn hóa Unicode nếu đặc tả coi các dạng tương đương là cùng một ký tự.

Nhập hai chuỗi trên hai dòng, nhận `true` hoặc `false`.

Lời giải chính có trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [NeetCode](https://neetcode.io/solutions/valid-anagram)
