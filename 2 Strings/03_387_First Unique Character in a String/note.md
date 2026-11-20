# Bài 387 · First Unique Character in a String

Đếm mỗi chữ cái bằng mảng 26 ô. Sau khi biết số lần xuất hiện trên toàn chuỗi, quét lại từ trái sang phải và trả chỉ số đầu tiên có tần suất 1. Lượt quét thứ hai áp dụng đúng thứ tự gốc.

Với `swiss`, s có tần suất 3, w và i đều có tần suất 1. Chỉ số 1 của w xuất hiện trước chỉ số 2 của i. Nếu tất cả tần suất đều lớn hơn 1 thì trả -1.

Với n ký tự, cách này mất O(n) thời gian và O(1) bộ nhớ phụ vì bảng chữ cái cố định. Thử đếm lại toàn chuỗi cho từng vị trí có thể mất O(n²) thời gian. Với bảng chữ cái tổng quát, bảng băm dùng O(k) bộ nhớ cho k ký tự khác nhau.

Nhập một dòng và nhận chỉ số tính từ 0.

Lời giải chính có trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [NeetCode](https://neetcode.io/solutions/first-unique-character-in-a-string)
