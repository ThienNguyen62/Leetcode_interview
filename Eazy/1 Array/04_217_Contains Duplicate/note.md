# Bài 217 · Contains Duplicate

Cho mảng số nguyên `nums` chưa sắp xếp. Trả về `true` ngay khi tìm được hai vị trí chứa cùng một giá trị. Nếu duyệt xong mà mọi giá trị đều khác nhau thì trả về `false`.

## Từ so sánh từng cặp đến tập băm

| Cách giải | Ý tưởng | Thời gian | Bộ nhớ phụ |
|---|---|---|---|
| So sánh từng cặp | Với mỗi vị trí, so sánh với tất cả vị trí đứng sau. | O(n²) | O(1) |
| Sắp xếp rồi duyệt | Sau khi sắp xếp, các giá trị bằng nhau nằm liền kề. Chỉ cần kiểm tra từng cặp liền nhau. | O(n log n) với thuật toán sắp xếp có cận này | Tùy thuật toán, ví dụ O(1) với heapsort tại chỗ |
| Tập băm | Lưu các giá trị đã gặp trong tập và dừng khi gặp lại một giá trị. | O(n) kỳ vọng | O(n) trong trường hợp mọi giá trị khác nhau |

Ở đây `n` là số phần tử. Với tối đa `10^5` phần tử, cách so sánh từng cặp có thể quá chậm. Sắp xếp tại chỗ đổi thứ tự của mảng. Nếu cần giữ thứ tự, hãy tính thêm O(n) bộ nhớ cho bản sao. Tập băm giữ nguyên thứ tự của mảng và cần trung bình O(1) cho mỗi lần kiểm tra hoặc chèn.

Trước khi xét phần tử hiện tại, `seen` chứa đúng các giá trị đã duyệt. Nếu phần tử đã có trong tập thì tồn tại một vị trí trước đó có cùng giá trị. Nếu chưa có, thêm nó vào tập để kiểm tra ở các lượt sau. Khi kết thúc vòng lặp, nếu chưa từng dừng sớm thì mọi giá trị đều khác nhau.

## Chạy tay với `[-4, 6, 0, 9, -4]`

| Giá trị đang xét | Tập sau lượt | Kết quả |
|---:|---|---|
| -4 | `{-4}` | Tiếp tục |
| 6 | `{-4, 6}` | Tiếp tục |
| 0 | `{-4, 6, 0}` | Tiếp tục |
| 9 | `{-4, 6, 0, 9}` | Tiếp tục |
| -4 | `{-4, 6, 0, 9}` | Trả về `true` |

Tập băm là lời giải chính trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Hai hướng sắp xếp và tập băm cũng có trong [chương trình Java cũ](java/Main217.java). Chọn tập băm vì có thời gian tuyến tính kỳ vọng và dừng ngay khi phát hiện trùng. Chưa xác minh được thứ hạng bình chọn trên LeetCode. [Doocs](https://leetcode.doocs.org/en/lc/217/) · [NeetCode](https://neetcode.io/solutions/contains-duplicate)

Các chương trình đọc `n` rồi đọc `n` số nguyên, cách nhau bằng khoảng trắng hoặc xuống dòng. Kết quả in ra là `true` hoặc `false`.
