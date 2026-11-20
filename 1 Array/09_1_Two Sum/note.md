# Bài 1 · Two Sum

### Tìm số bù

Duyệt từng cặp cho O(n²) thời gian và O(1) bộ nhớ phụ, với `n` là độ dài mảng. Thay vì thử mọi số đứng trước, với giá trị `x` hiện tại chỉ cần hỏi số `target - x` đã xuất hiện ở đâu. Bảng băm lưu mỗi giá trị đã duyệt cùng chỉ số của nó.

Với `[4, -2, 7, 1]` và đích 5, ghi nhận 4 tại vị trí 0. Đến -2, số bù 7 chưa có, nên lưu -2 tại vị trí 1. Đến 7, tìm được -2 và trả `1 2`. Khi gặp phần tử đứng sau của cặp hợp lệ, phần tử đứng trước đã có trong bảng. Tra trước khi chèn cũng đảm bảo hai chỉ số khác nhau, kể cả khi hai giá trị bằng nhau.

Bảng băm một lượt tốn O(n) thời gian kỳ vọng và O(n) bộ nhớ phụ. Sắp xếp các cặp giá trị và chỉ số rồi dùng hai con trỏ tốn O(n log n) thời gian và O(n) bộ nhớ cho các cặp. Các bản Java cũ vẫn có thể chạy qua [Main1.java](java/Main1.java).

Nhập `n target` rồi nhập `n` số. Chương trình in hai chỉ số gốc, tính từ 0.

Lời giải chính có trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [NeetCode](https://neetcode.io/solutions/two-sum)
