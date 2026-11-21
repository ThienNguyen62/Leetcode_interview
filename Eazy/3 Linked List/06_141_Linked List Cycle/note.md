# Bài 141 · Linked List Cycle

## Tư duy giải bài

Cách dùng tập lưu danh tính node đã gặp. Gặp lại cùng một node thì có vòng. Với n node phân biệt, cách này tốn O(n) thời gian kỳ vọng và O(n) bộ nhớ phụ.

Cách Floyd dùng slow đi một bước, fast đi hai bước. Nếu fast chạm null thì danh sách kết thúc. Nếu có vòng, cả hai sẽ vào vòng. Sau đó khoảng cách tương đối thay đổi một vị trí mỗi lượt theo modulo độ dài vòng, nên hai con trỏ chắc chắn gặp. Tổng thời gian O(n), bộ nhớ phụ O(1).

Ví dụ `5 → -1 → 8 → 2` với 2 trỏ lại 8. Sau lượt đầu slow ở -1 và fast ở 8. Lượt kế tiếp cả hai ở 8. So sánh danh tính node vì hai node giá trị bằng nhau vẫn có thể là hai node riêng.

Nhập `n pos`, rồi n giá trị. Chương trình dùng pos để dựng liên kết cuối trước khi gọi hàm. Kết quả là `true` hoặc `false`.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [Doocs](https://leetcode.doocs.org/en/lc/141/)
