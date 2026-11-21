# Bài 53 · Maximum Subarray

Đặt `ending` là tổng lớn nhất của đoạn kết thúc đúng ở vị trí đang xét. Với giá trị x mới, hoặc bắt đầu đoạn riêng từ x, hoặc nối x vào đoạn tốt nhất kết thúc ở ô trước. Vì vậy trạng thái mới là `max(x, ending + x)`. Lưu thêm `best` để lấy đáp án qua mọi vị trí kết thúc.

Với `[-4, 2, -1, 3, -7]`, các giá trị ending là -4, 2, 1, 4, -3. Đáp án là 4. Khởi tạo từ phần tử đầu, vì khi mảng toàn số âm ta vẫn phải chọn một đoạn không rỗng.

Kadane dùng O(n) thời gian, O(1) bộ nhớ phụ với n phần tử. Thử mọi đoạn bằng tổng tích lũy cho từng điểm bắt đầu dùng O(n²) thời gian và O(1) bộ nhớ phụ. Chia để trị có thể lấy lớn nhất giữa đoạn nằm trái, đoạn nằm phải và đoạn cắt giữa. Nếu quét để tính phần cắt giữa ở mỗi tầng, cách này dùng O(n log n) thời gian và O(log n) ngăn xếp.

Nhập n rồi nhập n số, chương trình in tổng tối đa.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Thứ hạng bình chọn trên LeetCode chưa được xác minh. [NeetCode](https://neetcode.io/solutions/maximum-subarray)
