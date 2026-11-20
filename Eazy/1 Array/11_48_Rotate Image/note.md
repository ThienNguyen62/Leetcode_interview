# Bài 48 · Rotate Image

### Tách phép xoay thành hai phép đổi chỗ

Xoay 90° theo chiều kim đồng hồ đưa ô `(row, col)` đến `(col, n - 1 - row)`. Chuyển vị qua đường chéo chính đưa nó đến `(col, row)`. Sau đó đảo từng hàng đổi chỉ số cột `row` thành `n - 1 - row`, đúng vị trí cần tìm.

Ví dụ, ma trận `[[8, 3], [2, -1]]` sau chuyển vị thành `[[8, 2], [3, -1]]`. Đảo từng hàng được `[[2, 8], [-1, 3]]`. Trong bước chuyển vị, chỉ duyệt phía trên đường chéo chính để mỗi cặp được đổi một lần.

Với ma trận `n × n`, cách này tốn O(n²) thời gian và O(1) bộ nhớ phụ. Xoay từng lớp theo nhóm bốn ô cũng đạt hai cận này, nhưng cần theo dõi nhiều tọa độ hơn. Một ma trận kết quả dùng phép ánh xạ trực tiếp cũng tốn O(n²) thời gian, nhưng cần O(n²) bộ nhớ và không đáp ứng yêu cầu tại chỗ.

Nhập `n`, sau đó nhập `n` hàng, mỗi hàng có `n` số. Chương trình in từng hàng sau khi xoay.

Lời giải chính có trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [NeetCode](https://neetcode.io/solutions/rotate-image)
