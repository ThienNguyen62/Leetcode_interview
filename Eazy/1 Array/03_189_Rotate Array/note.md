# Bài 189 · Rotate Array

Xoay mảng sang phải `k` bước nghĩa là đưa `k` phần tử cuối lên đầu, giữ thứ tự bên trong mỗi phần. Hàm sửa trực tiếp mảng đầu vào. Với `n` là độ dài mảng, cứ xoay `n` bước thì về vị trí cũ, nên trước hết tính `r = k % n`.

## Từ dịch từng bước đến đảo ba lần

| Cách giải | Ý tưởng | Thời gian | Bộ nhớ phụ |
|---|---|---|---|
| Dịch từng bước | Cất phần tử cuối, dịch phần còn lại sang phải một ô rồi đưa phần tử đã cất lên đầu. Lặp `r` lần. | O(1 + n·r) | O(1) |
| Mảng phụ | Ghi phần tử ở vị trí `i` vào ô `(i + r) % n`, rồi chép kết quả về mảng gốc. Mỗi vị trí đích nhận đúng một phần tử vì phép cộng modulo là song ánh. | O(n) | O(n) |
| Đảo ba lần | Đảo cả mảng, rồi đảo riêng `r` phần tử đầu và `n-r` phần tử cuối. | O(n) | O(1) |

Dịch từng bước dễ hình dung nhưng lặp lại thao tác trên cả mảng, có thể quá chậm khi `r` lớn. Mảng phụ tránh việc dịch lặp lại. Để bỏ mảng phụ, hãy tách mảng thành `A | B`, trong đó `B` gồm `r` phần tử cuối. Ta cần `B | A`. Đảo cả mảng đưa hai khối về đúng vị trí nhưng lật thứ tự bên trong chúng. Đảo từng khối lần nữa khôi phục thứ tự ban đầu của cả hai.

## Chạy tay với `[8, 2, 6, 1, 3]`, `k = 2`

| Thao tác | Mảng |
|---|---|
| Đảo cả mảng | `[3, 1, 6, 2, 8]` |
| Đảo đoạn đầu có 2 phần tử | `[1, 3, 6, 2, 8]` |
| Đảo đoạn còn lại | `[1, 3, 8, 2, 6]` |

Đảo ba lần là lời giải chính trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Cách này đáp ứng yêu cầu bộ nhớ phụ O(1) và được cả Doocs lẫn NeetCode trình bày. Chưa xác minh được thứ hạng bình chọn trên LeetCode. [Doocs](https://leetcode.doocs.org/en/lc/189/) · [NeetCode](https://neetcode.io/solutions/rotate-array)

## Khi viết và chạy thử

- Nếu `r = 0`, mảng đã ở đúng vị trí. Điều này cũng xảy ra với mảng một phần tử, hoặc khi `k` là bội số của `n`.
- Với chỉ số đầu và cuối đều được tính vào đoạn đảo, ba đoạn là `[0, n-1]`, `[0, r-1]` và `[r, n-1]`. Dùng hai con trỏ để đổi chỗ từ hai đầu vào giữa.
- Nhập `n k` rồi nhập `n` số. Chương trình in mảng đã xoay trên một dòng, cách nhau bằng khoảng trắng.
- Các bản Java cũ chạy qua [Main189.java](java/Main189.java) lần lượt minh họa [dịch từng bước](java/Solution189_1.java), [đảo ba lần](java/Solution189_2.java) và [mảng phụ](java/Solution189_3.java).
