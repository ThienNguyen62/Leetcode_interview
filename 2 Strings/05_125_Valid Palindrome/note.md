# Bài 125 · Valid Palindrome

Dùng hai con trỏ ở hai đầu. Bỏ qua ký tự không phải chữ hay số ở mỗi đầu, sau đó so sánh hai ký tự hợp lệ sau khi chuyển chữ thường. Nếu khác thì trả false. Nếu giống, dịch cả hai vào giữa. Mỗi cặp đối xứng đã xét đều khớp, nên khi hai con trỏ gặp nhau thì chuỗi hợp lệ.

Với `Z!2-z`, cặp Z và z khớp. Bỏ qua ! và -, còn chữ số 2 ở giữa, nên trả true. Chuỗi chỉ gồm dấu câu cũng hợp lệ vì không có cặp nào lệch.

Gọi n là số ký tự gốc. Hai con trỏ mất O(n) thời gian và O(1) bộ nhớ phụ. Lọc thành chuỗi mới rồi so với bản đảo cũng mất O(n) thời gian, nhưng dùng O(n) bộ nhớ phụ.

Nhập nguyên dòng, kể cả khoảng trắng. Chương trình in `true` hoặc `false`.

Lời giải chính có trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [NeetCode](https://neetcode.io/solutions/valid-palindrome)
