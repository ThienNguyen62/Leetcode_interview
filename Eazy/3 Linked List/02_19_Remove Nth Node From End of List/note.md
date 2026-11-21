# Bài 19 · Remove Nth Node From End of List

## Tư duy giải bài

Cách hai lượt đếm độ dài L trước, rồi xóa node ở chỉ số L - k tính từ 0, với k là thứ hạng từ cuối. Muốn không đếm trước, đặt một node giả trước head để thao tác xóa đầu và xóa giữa dùng chung một phép nối.

Đặt fast và slow ở node giả. Tiến fast k bước rồi tiến cả hai đến khi fast ở node cuối. Khoảng cách k cạnh giữ nguyên, nên slow đứng ngay trước node cần xóa. Nối `slow.next` qua node đó và trả `dummy.next`.

Ví dụ `8 → 4 → 6 → 2`, k = 2. Sau bước tạo khoảng cách, fast ở 4. Tiến cùng nhau hai lần thì fast ở 2 và slow ở 4. Nối 4 đến 2. Nếu k bằng độ dài, slow vẫn ở node giả và head đổi. Cả hai cách mất O(L) thời gian và O(1) bộ nhớ phụ.

Nhập `L k`, sau đó nhập L giá trị. Kết quả rỗng được in thành dòng trống.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [Doocs](https://leetcode.doocs.org/en/lc/19/)
