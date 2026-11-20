# Bài 26 · Remove Duplicates from Sorted Array

Hàm nhận mảng số nguyên đã sắp xếp không giảm. Hàm trả về số giá trị khác nhau `k` và ghi chúng theo đúng thứ tự vào `nums[0..k-1]`. Phần đuôi từ chỉ số `k` trở đi được bỏ qua.

## Từ đề bài đến thuật toán

Vì mảng đã sắp xếp, mọi bản sao của một giá trị nằm liền nhau. Cách trực tiếp là gom mỗi giá trị mới vào mảng phụ rồi chép ngược lại vào đầu `nums`. Cách này tốn thời gian O(n) và bộ nhớ phụ O(k), với `n` là độ dài mảng và `k` là số giá trị khác nhau.

Ta có thể dùng chính đầu mảng làm nơi lưu kết quả. Dùng `read` để duyệt từng phần tử, còn `write` vừa là số giá trị đã giữ, vừa là vị trí trống tiếp theo. Giữ phần tử đầu tiên rồi bắt đầu với `write = 1`. Nếu `nums[read]` khác giá trị cuối đã giữ (`nums[write - 1]`), ghi nó vào `nums[write]` rồi tăng `write`.

Trước mỗi lượt, đoạn đầu có độ dài `write` chứa đúng các giá trị khác nhau đã đọc. Giá trị hiện tại bằng giá trị cuối nghĩa là nó vẫn thuộc nhóm cũ. Nếu khác, nó bắt đầu một nhóm mới vì mảng đã sắp xếp. Luôn có `write <= read`, nên phép ghi không làm mất phần tử chưa đọc. Khi duyệt xong, `write` chính là `k`.

## Chạy tay với `[-3, -3, -1, 0, 0, 4]`

Ban đầu giữ `-3` và đặt `write = 1`.

| read | Giá trị đọc | Thao tác | Đoạn đầu sau lượt |
|---:|---:|---|---|
| 1 | -3 | Bỏ qua | `[-3]` |
| 2 | -1 | Ghi vào vị trí 1 | `[-3, -1]` |
| 3 | 0 | Ghi vào vị trí 2 | `[-3, -1, 0]` |
| 4 | 0 | Bỏ qua | `[-3, -1, 0]` |
| 5 | 4 | Ghi vào vị trí 3 | `[-3, -1, 0, 4]` |

Kết quả là `k = 4`. Cách hai con trỏ duyệt mảng một lần nên tốn **O(n) thời gian** và dùng **O(1) bộ nhớ phụ**. Đây là cách triển khai trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py).

Hai con trỏ được chọn làm lời giải chính vì phù hợp với yêu cầu sửa mảng tại chỗ và xuất hiện trong cả gợi ý chính thức lẫn bài viết cộng đồng về con trỏ nhanh/chậm. Thứ hạng theo lượt bình chọn chưa được xác minh. [Gợi ý LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array/?lang=en) · [Bài viết cộng đồng](https://leetcode.com/discuss/post/7156977/)

## Khi viết và chạy thử

- Dùng `nums[write - 1]` để so sánh với giá trị cuối đã giữ. `write` là vị trí trống và cũng là giá trị cần trả về.
- Mảng có một phần tử hoặc tất cả phần tử bằng nhau đều cho `k = 1`. Nếu mọi phần tử khác nhau thì `k = n`.
- Nhập `n`, sau đó nhập `n` số đã sắp xếp, cách nhau bằng khoảng trắng hoặc xuống dòng. Chương trình in `k` ở dòng đầu và `k` phần tử đã giữ ở dòng tiếp theo.
