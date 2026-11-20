# Bài 7 · Reverse Integer

Tách chữ số cuối bằng phần dư khi chia 10, rồi bỏ chữ số đó bằng phép chia về 0. Tích lũy kết quả bằng cách nhân giá trị hiện tại với 10 và cộng chữ số vừa lấy. Giữ dấu ngay trên từng chữ số để xử lý được -2147483648 mà không cần lấy trị tuyệt đối của cả số.

Trước khi nhân, so kết quả hiện tại với biên trên và dưới chia 10. Nếu đúng bằng ngưỡng thì so chữ số cuối với 7 ở phía dương và -8 ở phía âm. Như vậy giá trị trung gian không tràn. Trong Python, `divmod(x, 10)` làm tròn thương xuống. Khi x âm và phần dư khác 0, tăng thương thêm 1 và giảm phần dư đi 10 để phép chia làm tròn về 0.

Ví dụ -1204 cho các chữ số -4, 0, -2, -1 và các kết quả -4, -40, -402, -4021. Với d chữ số, thuật toán tốn O(d) thời gian và O(1) bộ nhớ phụ. Đảo qua chuỗi dễ hình dung nhưng dùng O(d) bộ nhớ và vẫn cần kiểm tra biên.

Nhập một số nguyên và in kết quả.

Lời giải chính có trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [NeetCode](https://neetcode.io/solutions/reverse-integer)
