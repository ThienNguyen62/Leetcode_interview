# Bài 122 · Best Time to Buy and Sell Stock II

Mảng `prices` cho biết giá cổ phiếu từng ngày. Cần trả về tổng lợi nhuận tối đa. Số giao dịch không giới hạn, mỗi lúc giữ tối đa một cổ phiếu. Có thể bán rồi mua lại cùng ngày.

## Từ quy hoạch động đến tham lam

Nếu mô phỏng quyết định mỗi ngày, ta chỉ cần biết đang giữ cổ phiếu hay đang giữ tiền. Gọi `cash` là lợi nhuận tốt nhất khi kết thúc ngày mà không giữ cổ phiếu, và `hold` là số tiền ròng tốt nhất khi còn giữ một cổ phiếu. Ngày đầu có `cash = 0` và `hold = -prices[0]`. Với giá ngày mới là `p`, tính đồng thời `cash_mới = max(cash, hold + p)` và `hold_mới = max(hold, cash - p)`. Mỗi trạng thái chọn giữa giữ nguyên và giao dịch. Sau ngày cuối, trả về `cash`. Cách này dùng O(n) thời gian và O(1) bộ nhớ phụ, với `n` là số ngày.

Ở bài này, không có phí hay thời gian chờ. Ta có thể nhìn vào từng cặp ngày liền nhau. Gọi `delta = prices[i] - prices[i - 1]`. Nếu giữ cổ phiếu qua khoảng đó, lợi nhuận thay đổi đúng `delta`. Ta chỉ cộng các `delta` dương.

Mọi giao dịch mua ngày `a` và bán ngày `b` có lợi nhuận bằng tổng các chênh lệch từ ngày `a` đến ngày `b`. Vì các khoảng nắm giữ không chồng nhau, lợi nhuận của mọi chiến lược bị chặn trên bởi tổng các chênh lệch dương. Ta đạt đúng cận này bằng cách giữ cổ phiếu qua mỗi chuỗi tăng liên tiếp. Do đó cách tham lam tối ưu.

## Chạy tay với `[2, 5, 1, 4, 4]`

| Cặp giá | Chênh lệch | Tổng lợi nhuận |
|---|---:|---:|
| 2 → 5 | +3 | 3 |
| 5 → 1 | -4 | 3 |
| 1 → 4 | +3 | 6 |
| 4 → 4 | 0 | 6 |

Hai giao dịch có lãi là mua ở giá 2 rồi bán ở 5, và mua ở 1 rồi bán ở 4. Kết quả là 6.

Cách tham lam chạy trong **O(n) thời gian** và dùng **O(1) bộ nhớ phụ** cho thuật toán. Đây là lời giải chính trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Cả Doocs và NeetCode đều trình bày cách cộng chênh lệch dương. Thứ hạng bình chọn trên LeetCode chưa được xác minh. [Doocs](https://leetcode.doocs.org/en/lc/122/) · [NeetCode](https://neetcode.io/solutions/best-time-to-buy-and-sell-stock-ii)

## Khi viết và chạy thử

- Duyệt từ chỉ số 1 để luôn có giá của ngày trước. Một ngày hoặc một dãy giá không tăng cho lợi nhuận 0.
- Các chương trình đọc `n` rồi đọc `n` giá, phân tách bằng khoảng trắng hoặc xuống dòng. Kết quả in ra là một số nguyên.
