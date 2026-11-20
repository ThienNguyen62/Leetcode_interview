# Bài 136 · Single Number

Mảng số nguyên có đúng một giá trị xuất hiện một lần. Mọi giá trị khác đều xuất hiện hai lần. Cần tìm giá trị đơn lẻ trong thời gian tuyến tính với bộ nhớ phụ hằng số.

## Từ đếm tần suất đến XOR

Gọi `n` là số phần tử.

| Cách giải | Ý tưởng | Thời gian | Bộ nhớ phụ |
|---|---|---|---|
| Đếm tần suất | Dùng bảng băm để đếm, rồi tìm số có tần suất 1. | O(n) kỳ vọng | O(n) |
| Sắp xếp | Sắp xếp để các số bằng nhau đứng liền nhau, rồi kiểm tra cặp `i` và `i + 1` với bước nhảy 2. | O(n log n) nếu dùng heapsort | O(1) với heapsort tại chỗ |
| XOR | Duyệt một lần và XOR từng số vào biến kết quả. | O(n) | O(1) |

Đề chỉ cần biết số nào còn lại sau khi khử các cặp. Phép XOR theo bit (`^`) cho bit 1 khi hai bit khác nhau. Vì vậy `x ^ x = 0` và `x ^ 0 = x`. Phép XOR có tính giao hoán và kết hợp, nên hai bản sao của một giá trị có thể triệt tiêu nhau dù nằm xa nhau. Sau khi XOR toàn bộ mảng, chỉ còn số xuất hiện một lần.

## Chạy tay với `[6, 3, 6, 0, 0]`

| Số đang xét | Kết quả sau khi XOR |
|---:|---:|
| 6 | 6 |
| 3 | 5 |
| 6 | 3 |
| 0 | 3 |
| 0 | 3 |

Khởi tạo kết quả bằng 0. Khi gặp số 6 thứ hai, hai số 6 triệt tiêu và kết quả còn lại là 3. Mảng một phần tử, đáp án bằng 0 và đáp án âm đều dùng cùng một vòng lặp.

XOR là lời giải chính trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py) vì đáp ứng cả hai giới hạn của đề. Doocs cũng trình bày XOR là lời giải đầu tiên. Thứ hạng bình chọn trên LeetCode chưa được xác minh. [Doocs](https://leetcode.doocs.org/en/lc/136/)

Các chương trình đọc `n`, sau đó đọc `n` số nguyên cách nhau bằng khoảng trắng hoặc xuống dòng. Kết quả in ra là số xuất hiện một lần. [Chương trình Java cũ](java/Main136.java) cho phép chạy thêm [bản sắp xếp](java/Solution136_2.java).
