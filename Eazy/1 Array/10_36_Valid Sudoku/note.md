# Bài 36 · Valid Sudoku

### Theo dõi hàng, cột và khối

Mỗi chữ số tại ô `(row, col)` thuộc ba nhóm: hàng `row`, cột `col` và khối `(row / 3) * 3 + col / 3` với phép chia lấy phần nguyên. Lưu chữ số đã gặp trong một tập riêng cho từng nhóm. Bỏ qua dấu chấm. Nếu chữ số đã có trong bất kỳ nhóm nào, trả `false`. Duyệt hết bảng thì trả `true`.

Ví dụ, số 8 ở `(0, 0)` và `(1, 1)` nằm khác hàng và khác cột, nhưng cùng thuộc khối 0. Sau khi thêm số 8 đầu tiên, lần gặp thứ hai sẽ phát hiện trùng trong tập của khối. Hai số 8 ở `(0, 0)` và `(4, 4)` thì thuộc các nhóm khác nhau và có thể cùng tồn tại.

Mỗi ô được xét một lần. Trên bảng cố định 9×9, thời gian và bộ nhớ đều O(1). Nếu tổng quát thành bảng `N × N` với `N` chữ số và các khối vuông, cách dùng tập tốn O(N²) thời gian kỳ vọng và O(N²) bộ nhớ. Có thể quét riêng từng nhóm và dùng lại một bảng đánh dấu kích thước O(N), vẫn mất O(N²) thời gian. Với đúng 9 chữ số, một mặt nạ 9 bit cho mỗi nhóm cũng đủ. Bài chỉ kiểm tra xung đột giữa các ô đã điền.

Nhập chín dòng, mỗi dòng một chuỗi gồm chín ký tự. Chương trình in `true` hoặc `false`.

Lời giải chính có trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [NeetCode](https://neetcode.io/solutions/valid-sudoku)
