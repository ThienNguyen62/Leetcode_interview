# Bài 66 · Plus One

### Cộng từ hàng đơn vị

Mỗi số 9 ở cuối biến thành 0 và truyền số nhớ sang trái. Gặp chữ số nhỏ hơn 9 thì tăng nó lên một và dừng. Nếu số nhớ đi qua hết mảng, tạo kết quả dài hơn một ô, đặt 1 ở đầu và để các ô còn lại bằng 0.

Ví dụ, với `[2, 9, 9]`, hai số 9 lần lượt thành 0, rồi 2 thành 3. Kết quả là `[3, 0, 0]`. Nếu đầu vào là `[9, 9]` thì không có chữ số nào hấp thụ số nhớ, nên kết quả là `[1, 0, 0]`.

Với `n` chữ số, thuật toán tốn O(n) thời gian trong trường hợp xấu nhất và O(1) bộ nhớ phụ ngoài mảng kết quả. Chuyển cả mảng thành kiểu số nguyên cố định có thể tràn vì đề cho tới 100 chữ số. Dùng mảng kết quả mới cho mọi trường hợp cũng đúng, với O(n) ô kết quả kể cả khi độ dài giữ nguyên.

Nhập `n` rồi nhập `n` chữ số. Chương trình in các chữ số kết quả trên một dòng, cách nhau bằng khoảng trắng.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [NeetCode](https://neetcode.io/solutions/plus-one)
