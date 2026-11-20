# Bài 350 · Intersection of Two Arrays II

Kết quả chứa mỗi giá trị `x` đúng `min(count1[x], count2[x])` lần. Thứ tự kết quả tùy ý. Ví dụ, nếu hai mảng lần lượt có hai và ba số 5 thì kết quả phải có hai số 5. Dùng tập hợp sẽ làm mất thông tin về số lần lặp.

## Từ ghép cặp đến đếm tần suất

- **Bảng băm.** Đếm tần suất trong mảng ngắn hơn. Khi duyệt mảng còn lại, gặp số nào còn lượt thì thêm một bản sao vào kết quả rồi trừ một lượt. Dùng O(m + n) thời gian kỳ vọng và O(min(m, n)) bộ nhớ phụ, chưa tính kết quả. `m` và `n` là độ dài hai mảng.
- **Sắp xếp và dùng hai con trỏ.** Khi hai giá trị bằng nhau, ghi nhận rồi tăng cả hai con trỏ. Nếu khác nhau, bỏ qua giá trị nhỏ hơn vì mọi giá trị còn lại ở mảng kia đều lớn hơn nó. Mỗi bước ghép tối đa một bản sao từ mỗi mảng. Chi phí là O(m log m + n log n) nếu dùng thuật toán sắp xếp có cận này. Bước ghép tốn O(m + n) thời gian và O(1) bộ nhớ phụ. Bộ nhớ sắp xếp tùy thuật toán, chẳng hạn O(1) với heapsort tại chỗ.

Trước mỗi bước của cách bảng băm, tần suất còn lại của một giá trị bằng số lần có trong mảng ngắn trừ số lần đã ghép. Mỗi bản sao trong mảng kia chỉ được xét một lần, nên sau khi duyệt xong số lần ghép đúng bằng tần suất nhỏ hơn của hai mảng.

## Chạy tay

Với mảng ngắn `[5, 2, 5]`, ta có hai lượt cho 5 và một lượt cho 2. Duyệt mảng còn lại `[2, 5, 8, 5, 5, 2]`.

| Giá trị | Xử lý | Kết quả |
|---:|---|---|
| 2 | Dùng lượt duy nhất của 2 | `[2]` |
| 5 | Dùng lượt đầu của 5 | `[2, 5]` |
| 8 | Không có trong bảng đếm | `[2, 5]` |
| 5 | Dùng lượt cuối của 5 | `[2, 5, 5]` |
| 5 | Đã hết lượt | `[2, 5, 5]` |
| 2 | Đã hết lượt | `[2, 5, 5]` |

## Câu hỏi mở rộng

- **Hai mảng đã sắp xếp.** Dùng hai con trỏ trực tiếp, O(m + n) thời gian và O(1) bộ nhớ phụ ngoài kết quả.
- **Một mảng nhỏ hơn nhiều.** Lập bảng đếm từ mảng nhỏ để giảm bộ nhớ. Nếu mảng lớn đã sắp xếp và có thể truy cập ngẫu nhiên, có thể tìm nhị phân hai biên của từng giá trị khác nhau ở mảng nhỏ để lấy tần suất trong mảng lớn, tránh quét toàn bộ mảng lớn.
- **Mảng lớn nằm trên đĩa.** Giữ bảng đếm của mảng nhỏ trong RAM và đọc mảng lớn tuần tự từng khối. Dùng chung bảng đếm giữa các khối để mỗi lượt chỉ được ghép một lần.

Bảng băm là lời giải chính trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). [Chương trình Java cũ](java/Main350.java) có thêm cách hai con trỏ. Doocs trình bày bảng băm cho bài này. Chưa xác minh được thứ hạng bình chọn trên LeetCode. [Doocs](https://leetcode.doocs.org/en/lc/350/)

Nhập `m n`, tiếp theo là `m` phần tử của mảng thứ nhất và `n` phần tử của mảng thứ hai. Chương trình in một danh sách theo thứ tự duyệt mảng dùng để đối chiếu. Nếu hai mảng dài bằng nhau, chương trình đếm mảng thứ nhất và duyệt mảng thứ hai.
