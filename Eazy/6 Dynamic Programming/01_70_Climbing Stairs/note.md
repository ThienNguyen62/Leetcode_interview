# Bài 70 · Climbing Stairs

Đặt `ways[i]` là số cách lên đúng bậc i. Bước cuối dài 1 hoặc 2, nên hai nhóm cách đi không giao nhau và `ways[i] = ways[i-1] + ways[i-2]`. Có một cách ở bậc 0 (chưa bước) và một cách lên bậc 1. Chỉ cần giữ hai trạng thái gần nhất.

Với n = 4, số cách qua các bậc 0 đến 4 là 1, 1, 2, 3, 5. Khởi tạo `ways[0] = 0` sẽ bỏ mất đường đi thẳng từ bậc 0 đến bậc 2.

Bản cuốn hai biến tốn O(n) thời gian và O(1) bộ nhớ phụ, với n là số bậc. Bảng DP đầy đủ cũng mất O(n) thời gian nhưng dùng O(n) bộ nhớ. Đệ quy trực tiếp có cận thời gian O(2^n) và ngăn xếp O(n) do tính lại trạng thái.

Nhập n, chương trình in số cách.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Thứ hạng bình chọn trên LeetCode chưa được xác minh. [NeetCode](https://neetcode.io/solutions/climbing-stairs)
