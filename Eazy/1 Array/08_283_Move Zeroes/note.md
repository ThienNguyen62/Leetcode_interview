# Bài 283 · Move Zeroes

### Duy trì vị trí ghi

Dùng `read` để xét từng phần tử và `write` để chỉ vị trí đặt giá trị khác 0 tiếp theo. Trước mỗi lượt, đoạn trước `write` chứa đúng các giá trị khác 0 đã đọc theo thứ tự. Đoạn từ `write` đến trước `read` chứa toàn số 0. Khi gặp giá trị khác 0, đổi nó với ô `write` nếu hai chỉ số khác nhau, rồi tăng `write`.

Chạy tay với `[0, -2, 0, 5]`. Số -2 đổi với ô 0, cho `[-2, 0, 0, 5]`. Số 5 đổi với ô 1, cho `[-2, 5, 0, 0]`. Vì ta lấy các số khác 0 theo thứ tự đọc, thứ tự tương đối được giữ.

Với `n` phần tử, cách đổi chỗ tốn O(n) thời gian và O(1) bộ nhớ phụ. Bỏ qua đổi chỗ với chính mình để tránh ghi mảng đã đúng vị trí. Một cách khác cũng đạt O(n) và O(1) là ghi dồn các số khác 0 rồi điền 0 vào đuôi. Dùng mảng tạm tốn O(n) thời gian và O(n) bộ nhớ phụ, nên không đáp ứng yêu cầu sửa tại chỗ.

Nhập `n` rồi nhập `n` số. Chương trình in mảng sau khi sửa trên một dòng.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [NeetCode](https://neetcode.io/solutions/move-zeroes)
