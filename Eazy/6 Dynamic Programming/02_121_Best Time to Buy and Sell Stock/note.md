# Bài 121 · Best Time to Buy and Sell Stock

Với mỗi ngày bán, chỉ cần biết giá mua thấp nhất trong các ngày trước đó. Tính lãi với mức giá thấp nhất đã ghi nhận, cập nhật lãi tốt nhất, rồi mới đưa giá hôm nay vào tập giá mua cho ngày sau. Khởi tạo lãi bằng 0 để cho phép bỏ qua giao dịch.

Với `[8, 3, 6, 2, 7]`, bán ở 6 cho lãi 3. Giá mua thấp nhất sau đó xuống 2, nên bán ở 7 cho lãi 5. Bài 121 chỉ cho một lượt mua và bán, vì vậy không cộng lãi của hai đoạn tăng như bài 122.

Với n ngày, duyệt một lượt dùng O(n) thời gian và O(1) bộ nhớ phụ. Thử tất cả cặp ngày mua và bán dùng O(n²) thời gian và O(1) bộ nhớ phụ.

Nhập n rồi nhập n mức giá, chương trình in lợi nhuận tối đa.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Thứ hạng bình chọn trên LeetCode chưa được xác minh. [NeetCode](https://neetcode.io/solutions/best-time-to-buy-and-sell-stock)
