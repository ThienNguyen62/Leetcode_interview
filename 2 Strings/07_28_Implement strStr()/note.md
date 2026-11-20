# Bài 28 · Find the Index of the First Occurrence in a String

Thử lần lượt từng điểm bắt đầu là cách trực tiếp. Với n ký tự văn bản và m ký tự mẫu, nó có thể mất O(n·m) thời gian và O(1) bộ nhớ phụ. Khi mẫu có nhiều đoạn lặp, KMP dùng lại những ký tự đã khớp.

Tạo bảng `lps[i]` là độ dài tiền tố thực sự dài nhất của `needle[0..i]` đồng thời là hậu tố của đoạn đó. Khi đang khớp j ký tự mà ký tự tiếp theo khác nhau, thử lại với `j = lps[j - 1]` và giữ nguyên vị trí văn bản. Chỉ các hậu tố đồng thời là tiền tố mới còn có thể mở đầu một lần khớp. Khi khớp đủ m ký tự, trả chỉ số bắt đầu ngay, nên luôn lấy lần xuất hiện đầu tiên.

Ví dụ, mẫu `aaab` có bảng `[0, 1, 2, 0]`. Khi tìm trong `aaaaab`, các lần gặp a ở vị trí dự kiến là b sẽ lùi j từ 3 về 2 để tận dụng hai ký tự a vừa khớp. Gặp b ở cuối, kết quả là 2.

Xây bảng mất O(m) và quét văn bản mất O(n) vì mỗi lần lùi đều bù cho một lần tăng chỉ số khớp trước đó. Tổng thời gian O(n + m), bộ nhớ phụ O(m). Nhập văn bản và mẫu trên hai dòng.

Lời giải chính có trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [NeetCode](https://neetcode.io/solutions/find-the-index-of-the-first-occurrence-in-a-string)
