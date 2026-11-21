# Bài 198 · House Robber

Gọi `dp[i]` là số tiền tối đa từ i nhà đầu. Bỏ nhà thứ i thì giữ `dp[i-1]`. Chọn nhà thứ i thì phải bỏ nhà liền trước, nên lấy `dp[i-2] + nums[i-1]`. Mọi phương án thuộc một trong hai trường hợp, nên lấy giá trị lớn hơn.

Với `[4, 1, 1, 9]`, sau từng nhà, kết quả tốt nhất là 4, 4, 5, 13. Ở nhà cuối, chọn 9 cộng với kết quả 4 của hai nhà đầu. Cần tính kết quả mới trước khi thay hai trạng thái cũ.

Với n nhà, bản cuốn hai biến dùng O(n) thời gian và O(1) bộ nhớ phụ. Bảng DP đầy đủ dùng O(n) bộ nhớ. Đệ quy có ghi nhớ cũng chạy O(n) nhưng cần O(n) bộ nhớ cho kết quả trung gian và ngăn xếp.

Nhập n rồi nhập n số tiền, chương trình in tổng tối đa.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Thứ hạng bình chọn trên LeetCode chưa được xác minh. [NeetCode](https://neetcode.io/solutions/house-robber)
