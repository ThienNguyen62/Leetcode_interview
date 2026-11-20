# Bài 14 · Longest Common Prefix

Dùng chuỗi đầu làm chuẩn và kiểm tra theo từng cột từ trái sang phải. Ở cột i, nếu bất kỳ chuỗi nào đã hết hoặc có ký tự khác, trả đoạn từ đầu đến trước i. Mọi cột trước i đều đã được xác nhận chung, và một tiền tố dài hơn sẽ phải chứa cả cột vừa sai.

Với `["station", "stay", "stack"]`, ba cột s, t, a giống nhau. Cột kế tiếp khác, nên trả `"sta"`. Một chuỗi rỗng làm kết quả rỗng ngay.

Gọi k là số chuỗi và L là độ dài chuỗi ngắn nhất. Chi phí là O(k·(L + 1)) và O(1) bộ nhớ phụ ngoài chuỗi trả về. Cách quét ngang cũng giữ được một độ dài tiền tố rồi thu ngắn sau mỗi chuỗi, không cần tạo bản sao ở mỗi lần rút gọn.

Nhập số lượng chuỗi trên dòng đầu, sau đó mỗi chuỗi một dòng. Kết quả rỗng được in thành dòng trống.

Lời giải chính có trong [C++](c++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [NeetCode](https://neetcode.io/solutions/longest-common-prefix)
