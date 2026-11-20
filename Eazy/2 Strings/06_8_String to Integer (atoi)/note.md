# Bài 8 · String to Integer (atoi)

Chia quá trình đọc thành ba bước: bỏ dấu cách ở đầu, lấy tối đa một dấu, rồi đọc các chữ số liền nhau. Dừng ngay khi gặp ký tự khác chữ số. Nếu không đọc được số nào, biến tích lũy vẫn bằng 0.

Tích lũy dưới dạng số không dương để chứa được cả -2147483648. Trước bước `value * 10 - digit`, nếu value nhỏ hơn -214748364 thì chắc chắn tràn. Khi bằng ngưỡng, chữ số tối đa là 7 cho kết quả dương và 8 cho kết quả âm. Khi tràn, trả biên ngay.

Với `  -0012x3`, bỏ hai dấu cách, nhận dấu trừ, rồi tích lũy 0, 0, -1, -12. Gặp x thì dừng. Chuỗi `+-12` trả 0 vì sau dấu đầu tiên là một dấu khác.

Với n ký tự, xử lý trực tiếp mất O(n) thời gian và O(1) bộ nhớ phụ. Cắt đoạn chữ số ra chuỗi riêng rồi chuyển kiểu cần O(n) bộ nhớ cho đoạn cắt và vẫn phải xử lý giá trị vượt biên.

Nhập nguyên dòng, có thể để trống. Chương trình in số đã phân tích.

Lời giải chính có trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [Doocs](https://leetcode.doocs.org/en/lc/8/)
