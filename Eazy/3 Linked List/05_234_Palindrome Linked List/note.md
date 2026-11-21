# Bài 234 · Palindrome Linked List

## Tư duy giải bài

Cách trực tiếp chép giá trị vào mảng, rồi so hai đầu. Với n node, cách đó tốn O(n) thời gian và bộ nhớ. Để giảm bộ nhớ, dùng slow đi một bước và fast đi hai bước. Dừng khi fast không thể đi thêm hai bước. Slow là node cuối của nửa đầu nếu độ dài chẵn, hoặc node giữa nếu độ dài lẻ.

Đảo đoạn sau slow rồi so với đoạn đầu cho đến khi đoạn đảo hết. Ví dụ `3 → 7 → 0 → 7 → 3`: slow dừng ở 0, nửa sau đảo thành `3 → 7`. Hai cặp đối xứng đều khớp. Cuối cùng đảo nửa sau lần nữa và nối lại, kể cả khi phát hiện không đối xứng. Cách làm tốn O(n) thời gian, O(1) bộ nhớ phụ và khôi phục liên kết gốc.

Nhập n rồi nhập n giá trị. Kết quả là `true` hoặc `false`.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [Doocs](https://leetcode.doocs.org/en/lc/234/)
